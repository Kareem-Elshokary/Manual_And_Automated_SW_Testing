public class palindromeNumber {

    public static void main(String[] args) {
        if(isPalindrome(121)){
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It isn't a palindrome number");
        }
    }

    public static boolean isPalindrome (int number) {

        int reverse = 0, checkVar = number;

        while(checkVar != 0){
            reverse += (checkVar % 10);
            checkVar /= 10;
            if (!(checkVar == 0)){
                reverse *= 10;
            }
        }

        return reverse == number;
    }

}
