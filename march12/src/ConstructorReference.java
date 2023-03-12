interface Trans {
    Stmt getTrx(String status);
}

class Stmt {
    public Stmt(String status) {
        System.out.println(status);
    }
}

public class ConstructorReference {
    public static void main(String[] args) throws Exception {
        Trans t = Stmt::new;
        t.getTrx("Trx successs...");
    }
}