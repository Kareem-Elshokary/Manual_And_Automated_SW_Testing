import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lists_Interface {

    /*
        - Lists is used to store the ordered collections of elements sequentially.
        - The List interface offers methods to access elements by their index.
        - Allows the duplicate elements
        - The implementation classes of the List interface are:
            ArrayList,
            LinkedList,
            Stack,
            and Vector.
    */

    public static void main(String[] args) {

        //Init a list with ArrayList class
        List<String> myList = new ArrayList<>();

        //Adding elements
        myList.add("Java");
        myList.add("C++");
        myList.add("Python");
        myList.add("DSA");

        //Updating elements
        myList.set(1, "C language");

        System.out.println(myList);

        //Searching elements
        int searchElement = myList.indexOf("Python");
        System.out.println("The index of element Python is " + searchElement);

        //Accessing elements
        String firstElement = myList.get(0);
        String lastElement  = myList.get(3);
        System.out.println("First element is " + firstElement + ", Last element is " + lastElement);

        //Removing elements
        myList.remove("C language");
        System.out.println(myList);

        //Checking if an element is present or not
        boolean isContain = myList.contains("C language");
        System.out.println("Is C language element is present? " + isContain);

        //Checking if the list is empty
        boolean isEmpty = myList.isEmpty();
        System.out.println("Is list empty? " + isEmpty);


        //Init a list with Vector class
        List<Integer> list = new Vector<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        for (int i : list){
            System.out.print( i + ", ");
        }

    }


}
