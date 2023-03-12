import java.util.*;
import java.util.stream.Collectors;
public class Customer {
    private int age, cid;
    private String cName;
    public Customer(int cid, String cName, int age){
        this.cid = cid;
        this.cName = cName;
        this.age = age;
    }
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "John", 25));
        customers.add(new Customer(2, "Levi", 63));
        customers.add(new Customer(3, "Sasha", 18));
        customers.add(new Customer(4, "Eren", 28));
        List<Integer> filteredAges = customers.stream()
        .filter(cust->cust.age>20)
        .map(cust->cust.age)
        .collect(Collectors.toList());
        Customer min = customers.stream().min((c1, c2)->c1.age-c2.age).get();
        Customer max = customers.stream().max((c1, c2)->c1.age-c2.age).get();
        System.out.println("Maximum Age: "+max.age);
        System.out.println("Minimum Age: "+min.age);

        System.out.println(filteredAges);
    }
}
