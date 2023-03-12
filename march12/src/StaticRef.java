public class StaticRef {
    public static void calc(){
        System.out.println("Calling static class method...");
    }
    public static void main(String[] args) {
        // Static method reference
        Interface1 in1 = StaticRef::calc;
        in1.m1();
    }
}
