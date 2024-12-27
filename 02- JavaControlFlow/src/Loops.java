public class Loops {

    public static void main(String[] args) {

        /*
        * for loop
        * for(init; condition; iteration step) {
        *   //body
        * }
        * */
        int sum = 0, count = 0;
        for(int i = 1; i <= 1000; i++){
            if( i%3 == 0 && i%5 == 0){
                System.out.println("Found a match: " + i);
                sum += i;
                count++;

                if(count == 5){
                    System.out.println("Sum of the numbers = " + sum);
                    break;
                }
            }
        }

        /*
        * while loop
        * while(condition){
        *   //body
        * }
        * */


        /*
        * do-while loop
        * do {
        *   //body, will be executed at least one time
        * } while(condition)
        * */

    }

}
