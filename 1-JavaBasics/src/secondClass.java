public class secondClass {

    public static void main(String[] args) {

        int x = 10, y = 15;
        int a = 10; float b = 3.147f;

        // Arithmetic operations
        int addition = x + y;
        int subtraction = x - y;
        int multiply = x * y;
        float divide = (float) y / x;
        int module = x % y;
        x++; // increment
        y--; // decrement
        System.out.println("x+y = " + addition);
        System.out.println("x-y = " + subtraction);
        System.out.println("x*y = " + multiply);
        System.out.println("x/y = " + divide);
        System.out.println("x%y = " + module);
        System.out.println("x after INC = " + x + " y after DEC = " + y);

        // Comparison operations
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(b == 3.147);
        System.out.println(b != 3.147);

        // Logical operations
        System.out.println((a<y) && (b>a));
        System.out.println((a<y) || (b>a));
        System.out.println( !((a<y) && (b>a)));

    }
}
