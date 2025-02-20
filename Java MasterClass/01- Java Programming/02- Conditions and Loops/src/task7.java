/*
 * Java Masterclass
 * Kareem El-Shokary
 * Draw a star pattern
 * */


import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of rows:  \n");
        int number = scan.nextInt();

        int rowNumbers, columnNumber;

        //In the first or last row
        //In the first or last column
        //When the row number equals the column number
        //When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)

        // Iterate over each row
        for(rowNumbers = 1; rowNumbers<=number; rowNumbers++){

            // Iterate over each column
            for(columnNumber = 1; columnNumber<=number; columnNumber++){

                if( ((columnNumber == 1) || (columnNumber == number)) || (rowNumbers == columnNumber)
                        || (columnNumber == (number - rowNumbers +1)) || (rowNumbers == 1 || rowNumbers == number) ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            // Move to the next line
            System.out.println();
        }

    }

}
