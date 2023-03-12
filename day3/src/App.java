import com.arithmetic.*;

public class App {
    public static void main(String[] args) {
        Add a = new Add();
        Subtract b = new Subtract();
        Multiply c = new Multiply();
        Divide d = new Divide();

        System.out.println(a.add(5, 6));

        System.out.println(b.subtract(5, 6));

        System.out.println(c.multiply(5, 6));

        System.out.println(d.divide(5, 6));
    }
}
