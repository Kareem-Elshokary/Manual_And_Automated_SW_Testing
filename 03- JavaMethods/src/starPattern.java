public class starPattern {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar (int number){

        if (number < 5){
            System.out.println("Invalid Value");
            return;
        }

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
