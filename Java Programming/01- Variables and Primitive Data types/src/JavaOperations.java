public class JavaOperations {

    public static void main(String[] args) {

        int x = 10, y = 15;
        int a = 10; float b = 3.147f;

        // Arithmetic operations
        int addition = x + y;           System.out.println("x+y = " + addition);
        int subtraction = x - y;        System.out.println("x-y = " + subtraction);
        int multiply = x * y;           System.out.println("x*y = " + multiply);
        float divide = (float)y / x;    System.out.println("x/y = " + divide);
        int module = x % y;             System.out.println("x%y = " + module);
        x++; // increment
        y--; // decrement
        System.out.println("x after INC = " + x + " y after DEC = " + y);


        // Comparison operations
        System.out.println("a > b? " + (a > b));
        System.out.println("a < b? " + (a < b));
        System.out.println("is b = 3.147? " + (b == 3.147));
        System.out.println("is b != 3.147? " + (b != 3.147));


        // Logical operations
        System.out.println((a<y) && (b>a));
        System.out.println((a<y) || (b>a));
        System.out.println( !((a<y) && (b>a)));

    }

}
