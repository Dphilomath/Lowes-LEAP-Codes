public class Employee {
    private int eid, basic;
    Character category;
    float hra, ta, da, gross;
    private String eName;
    public Employee(int eid, int basic, String eName){
        this.eid = eid;
        this.eName = eName;
        this.basic = basic;
        this.ta = basic*8/100;
        this.da = basic * 9/100;
        this.gross = basic+this.ta+this.da+this.hra;
        if(this.gross>=25000) category = 'A';
        else if(this.gross >= 10000) category = 'B';
        else category = 'C';
    }
    public void getEmployeeDetails() {
        System.out.println("Gross Salary for "+eName+" is: "+this.gross);
        System.out.println("Employee Category: "+this.category);
    }
    public static void main(String[] args) {
        Employee e = new Employee(123, 12000, "John");
        e.getEmployeeDetails();
    }
}
