public class Parent2 implements Interface1, Interface2 {

    @Override
    public void showInterface() {
        System.out.println("Hello there, I'm a method defined in both interface1 and interface2 and implemented by Parent2 class, and there is no diamond problem");        
    }
    public void showParent2(){
        System.out.println("Hi, this is showparent2 method from parent2");
    }
}
