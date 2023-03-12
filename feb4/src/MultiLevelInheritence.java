public class MultiLevelInheritence extends Parent1 {
    public void multilevel() {
        System.out.println("Calling multilevel from Multilevel.java");
    }
    public static void main(String[] args) {
        MultiLevelInheritence m = new MultiLevelInheritence();
        m.show();
        m.showParent2();
    }
}


