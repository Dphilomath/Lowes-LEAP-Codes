public class AMS {
    public static void getStudentDetails(int sid, String sname, int m1, int m2, int m3, int atnd, int nodp) {
        System.out.println("Total marks for 3 subs: "+(m1+m2+m3));
        System.out.println("Average of 3 subjects : "+(m1+m2+m3)/3);
        int regpercent = 100*nodp/atnd;
        if(regpercent<60) System.out.println("The student is irregular");
        else System.out.println("the student is regular");
    }
    public static void main(String[] args) {
        getStudentDetails(123, "John", 50, 75, 80, 280, 200);
    }
}
