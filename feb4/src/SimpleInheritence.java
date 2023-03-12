public class SimpleInheritence extends Parent1 {
    public void showChild() {
        System.out.println("Hello, I'm showChild() defined in child class");
    }
    public static void main(String[] args) {
        SimpleInheritence c = new SimpleInheritence();
        c.show();
        c.showChild();
        c.showInterface();
    }
}
