public class Control {
    public static void oddOrEven(int x) {
        if (x % 2 == 0)
            System.out.println(x + " is Even");
        else
            System.out.println(x + " is Odd");
    }

    public static void printforLoop(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printFactorsWhileLoop(int x) {
        int i = 1;
        System.out.println("Factors of " + x + " are:");
        while (i < x) {
            if (x % i == 0)
                System.out.print(i + " ");
            i++;
        }
        System.out.println();
    }

    public static void doWhilePrinting(int x) {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        } while (i < x);
        System.out.println();
    }

    public static void switchSttmnt(int x) {
        switch (x) {
            case 0:
                System.out.println("You chose 0");
                break;
            case 1:
                System.out.println("you chose 1");
            case 2:
                System.out.println("you chose 2");
            default:
                System.out.println("you chose something other than 0, 1 and 2, so you're sent to default block");
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        oddOrEven(5);
        oddOrEven(22);
        System.out.println("printing factors using while loop: ");
        printFactorsWhileLoop(165);
        System.out.println("printing using do while loop: ");
        doWhilePrinting(10);
        System.out.println("printing using for loop: ");
        printforLoop(10);
        System.out.println("Calling switch with key = 0 ");
        switchSttmnt(0);
    }
}
