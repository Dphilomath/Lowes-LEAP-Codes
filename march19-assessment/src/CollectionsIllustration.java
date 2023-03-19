import java.util.*;

public class CollectionsIllustration {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(9, "Red");
        hashMap.put(12, "Black");
        hashMap.put(6, "Green");
        hashMap.put(19, "White");
        System.out.println("HashMap iteration Order:");
        System.out.println("Key\tValue");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "\t " + entry.getValue());
        }

        Map<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(9, "Red");
        tm.put(12, "Black");
        tm.put(6, "Green");
        tm.put(19, "White");
        System.out.println("\nTreeMap iteration Order:");
        System.out.println("Key\tValue");
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        //see if a key exists
        System.out.println("\nDoes the key 9 exist in the HashMap? " + hashMap.containsKey(9));

    
    //sorting hashMap by key
    System.out.println("Stream API to sort HashMap by keys:");
    hashMap.entrySet().stream()
    .sorted(Map.Entry.<Integer, String>comparingByKey())
    .forEach(System.out::println);

    Set<Integer> set = new HashSet<>();

    for(int x:new int[]{4,5,6,7,4,2,1,2})
    {
        set.add(x);
    }
    System.out.println("\n\nDisplaying set elements:"+set);
    //check whether an element exists in the set
    System.out.println("Does the set contain 4? "+set.contains(4));
    //remove an element from the set
    set.remove(4);
    System.out.println("Displaying set elements after removing 4:"+set);
 
    List<Integer> list = new ArrayList<>();for(
    int x:new int[]{4,5,6,7,4,2,1,2})
    {
        list.add(x);
    }
    System.out.println("\nDisplaying list elements:"+list);
    System.out.println("Sorting list elements in reverse order:");
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);
    System.out.println("Sort list elements in ascending order:");
    Collections.sort(list);
    System.out.println(list);
    //find an element
    System.out.println("Index of 1 is: " + list.indexOf(1));
    //delete an element
    System.out.println(list.remove(1));
    System.out.println("Displaying list elements after removing 1:"+list);

    //HashMap allows one null key and multiple null values but Hashtable doesn't allow any null key or value
    Map<Integer, String> hashMap2 = new HashMap<Integer, String>();
    Map<Integer, String> hashTabMap = new Hashtable<>();
    try {
        hashMap2.put(null, "Red");
        //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
        hashTabMap.put(null, "hello"); 
    } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
    }
    //No Error
    
}}
