public class ProductCtlg {
    public static void getTotal_cost(int pid, String pName, int qty, int stock, int up) {
        if(qty>stock) {
            System.out.println("The product " + pName + " is out of stock");
            return;
        }
        System.out.println("Total cost: "+up*qty);
        System.out.println("Remaining Stock: "+ (stock-qty));
    }
    public static void main(String[] args) {
        getTotal_cost(0, "anony", 1, 10, 50);
    }
}
