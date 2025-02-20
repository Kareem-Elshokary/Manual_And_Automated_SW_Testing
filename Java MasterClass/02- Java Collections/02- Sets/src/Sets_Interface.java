import java.util.*;

public class Sets_Interface {

    /*
        - Set is an unordered collection of objects in which duplicate values cannot be stored.
        - Classes that implement the Set interface in Java Collections are:
            HashSet,
            LinkedHashSet,
            and TreeSet.
    */

    public static void main(String[] args) {

        //Initialized a set by HashSet class
        //The objects that we insert into the HashSet do not guarantee to be inserted in the same order.
        //The objects are inserted based on their hashcode.
        Set<Integer> hSet1 = new HashSet<>();
        hSet1.addAll( Arrays.asList(new Integer[] {1, 3, 5, 2, 8}) );

        Set<Integer> hSet2 = new HashSet<>();
        hSet2.addAll( Arrays.asList(new Integer[] {2, 4, 6, 8, 0}) );

        System.out.println(hSet1);
        System.out.println(hSet2);



        System.out.println();

        //Initialized a set by LinkedHashSet class
        //It maintains the order in which elements were inserted.
        Set<String> lHashSet = new LinkedHashSet<>();

        lHashSet.add("Kareem");
        lHashSet.add("Abdelkader");
        lHashSet.add("Omar");
        lHashSet.add("Kareem");

        for(String s : lHashSet){
            System.out.println(s);
        }

        lHashSet.remove("Omar");
        System.out.println("Set1 after removing elements: " + lHashSet);
        System.out.println("the size of the Set = " + lHashSet.size());
        lHashSet.clear();
        System.out.println("Is Set1 empty? " + lHashSet.isEmpty());


        System.out.println();

        //Initialized a set by TreeSet class
        //It behaves like a simple set with the exception that it stores elements in a sorted format.
        //TreeSet uses a tree data structure for storage.
        Set<String> tSet = new TreeSet<>();

        tSet.addAll(Arrays.asList(new String[] {"Egypt", "South Africa", "India", "Australia", "South Africa"}) );
        System.out.println(tSet);


    }

}
