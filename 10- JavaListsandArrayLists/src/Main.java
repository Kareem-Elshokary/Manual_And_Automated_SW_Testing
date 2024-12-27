import java.util.ArrayList;
import java.util.List;

/**
 * Java Masterclass
 * Description: Lists and ArrayLists
 * Author     : Kareem Abdelkader
 */


public class Main {

    public static void main(String[] args) {

        /*
        * List It is used to store the ordered collections of elements 'sequentially', allows duplicate
        * elements. The implementation classes of the List interface are ArrayLists, LinkedLists, and Vectors.
        * */
        List<String> listName = new ArrayList<>();

        /*
        * List interface operations:
        *   1- Adding an element at the end or at a specific index
        *   2- Accessing element
        *   3- Set a specific index with a new element
        *   4- Searching for elements
        *   5- Searching for elements
        *   6- Removing all elements or a specific element
        * */

        listName.add("First");                        //used to add element to the list
        listName.add("Second");
        listName.add("Third");

        for(String s : listName){
            System.out.println(s);
        }

        listName.add(3,"Fourth");       //used to add element at a specific element
        System.out.println(listName.get(3));          //used to return a specific index's element
        listName.set(3,"new 4");                      //used to replace a specific index element with a new element
        System.out.println(listName.get(3));

        listName.remove(3);                     //used to remove a specific index or element
        listName.clear();                             //used to clear all elements

        if (listName.isEmpty()){                      //used to check if the list is empty
            System.out.println("The list is empty");
        }


    }


}
