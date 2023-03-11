import java.util.Random;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        System.out.print("Enter number of products: ");
        Scanner sc = new Scanner(System.in);
        int nop = sc.nextInt();
        boolean OOS[] = new boolean[nop];
        String[] pNames = new String[nop];
        int[] up = new int[nop], qty = new int[nop], stock = new int[nop], pid = new int[nop];
        for (int i = 0; i < nop; i++) {
            pid[i] = new Random().nextInt();
            System.out.print("Please enter product name: ");
            pNames[i] = sc.next();
            System.out.print("Please enter unit price: ");
            up[i] = sc.nextInt();
            System.out.print("Please enter qty: ");
            qty[i] = sc.nextInt();
            System.out.print("Please enter available stock qty: ");
            stock[i] = sc.nextInt();
        }
        for (int i = 0; i < OOS.length; i++) {
            if (qty[i] > stock[i])
                System.out.println("The product " + pNames[i] + " is out of stock");
            else {
                System.out.println("Total cost: " + up[i] * qty[i]);
                System.out.println("Remaining Stock of Product "+pNames[i]+": " + (stock[i] - qty[i]));
            }

        }
        sc.close();
    }
}
