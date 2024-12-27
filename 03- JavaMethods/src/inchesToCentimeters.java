/*
 * Java Masterclass
 * Author     : Kareem Abdelkader
 * Description: [Overloaded Methode Challenge], Convert a foot&inches height to inches, then convert inches to centimeters
 * */

public class inchesToCentimeters {

    public static void main(String[] args) {

        double height = convertIntoCentimeters(5,8);
        System.out.println(height + " cm");
    }

    public static double convertIntoCentimeters (int heightInInches){

        // 1 inch = 2.54 cm
        return heightInInches * 2.54;
    }

    public static double convertIntoCentimeters (int heightInFoot, int heightInInches){

        // 1 foot = 12 inches
        int totalHeight = (heightInFoot * 12) + heightInInches;
        return convertIntoCentimeters(totalHeight);
    }
}
