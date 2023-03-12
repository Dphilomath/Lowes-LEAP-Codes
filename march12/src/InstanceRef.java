public class InstanceRef {
    public void calc(){
        System.out.println("Calling non-static class method...");
    }
    public static void main(String[] args) throws Exception {
        InstanceRef i = new InstanceRef();
        Interface1 in1 = i::calc;
        in1.m1();
        Interface1 in2 = new InstanceRef()::calc;
        in2.m1();
    }
}