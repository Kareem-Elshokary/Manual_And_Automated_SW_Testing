public class Strings {

    public static void main(String[] args) {

        /*
        String: is an object that holds several characters within "", it's immutable.
        */
        String myText = "Java Programming";         //Stored in string pool
        String myString = "Java Programming";       //Stored in heap


        //Strings common methods
        System.out.println("String length = " + myText.length());
        System.out.println("Convert to upper case -> " + myText.toUpperCase());
        System.out.println("Convert to lower case -> " + myText.toLowerCase());
        System.out.println("Is the string empty? " + myString.isEmpty());
        System.out.println("Is myText equal to myString? " + myString.equals(myText));


        //Concatenation
        String str1 = "Kareem";
        String str2 = "Abdelkader";
        System.out.println(str1 + " " + str2);
        System.out.println(str1.concat(str2));

        int x = 10;
        System.out.println(str1 + x);       //If you add a number and a string, the result will be a string concatenation


        //Escape character
        String specialChar = "To print a special character such as \', \", or \\ use backslash";
        System.out.println(specialChar);


        //Text block
        String textBlock = """
                used for
                multi lines
                text.
                """;
        System.out.println(textBlock);

    }

}
