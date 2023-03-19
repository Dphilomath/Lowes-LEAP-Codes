import java.sql.*;

public class CRUD_JDBC {
    static Statement stmt;
    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

    public static void insertIntoTable(Statement stmt, int cid, String cname, String loc, int age) throws SQLException {
        try {
            String insertString = "insert into customer values("+cid+",'" + cname+"','"+loc+"',"+age+");";
            System.out.println(insertString);
            stmt.execute(insertString);
            System.out.println("Record inserted into customer table successfully");
            showRecords(stmt);
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static void createTable(Statement stmt) throws SQLException {
        try {
            String createTableSQL = "create table customer (cid int, cname varchar(255), loc varchar(255), age int)";
            stmt.execute(createTableSQL);
            System.out.println("Table Customer Created Successfully");
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static void showRecords(Statement stmt) {
        try {
            String selectStmt = "select * from customer";
            ResultSet rs = stmt.executeQuery(selectStmt);
            System.out.println("cid\tcname\tloc\tage");
            while (rs.next())
                System.out.println(rs.getInt(1) + "\t"+ rs.getString(2) + "\t" + rs.getString(3)
                        + "\t" + rs.getInt(4));

        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static void updateRecord(Connection con) throws SQLException {
        String UPDATE_USERS_SQL = ("update customer set cname = ? where cid = ?;");
        try ( 
            PreparedStatement preparedStatement = con.prepareStatement(UPDATE_USERS_SQL)) {
            System.out.println("Table before update");
            showRecords(preparedStatement);
            preparedStatement.setString(1, "dan");
            preparedStatement.setInt(2, 1);

            preparedStatement.executeUpdate();
            System.out.println("Table after update");
            showRecords(preparedStatement);
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static void deleteRecord(Connection con) throws SQLException {
        String DELETE_USERS_SQL = "delete from customer where cid = 3;";
        try {
            System.out.println("Table before deletion:");
            showRecords(stmt);
            int result = stmt.executeUpdate(DELETE_USERS_SQL);
            System.out.println("Number of records affected :: " + result);
            System.out.println("table after deleting record with id: 3");
            showRecords(stmt);
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_db", "daniyal", "daniyal");
            stmt = con.createStatement();
            createTable(stmt);
            insertIntoTable(stmt, 1, "daniyal", "silchar", 22);
            insertIntoTable(stmt, 2, "zafar", "Delhi", 21);
            insertIntoTable(stmt, 3, "gaurav", "Jharkhand", 23);

            updateRecord(con);
            deleteRecord(con);
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
