/*
 * Java Masterclass
 * Kareem El-Shokary
 * A program to convert from kilobytes to megabytes
 * */


public class task7 {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        // Check for invalid inputs (less than 0)
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }

        int megabytes = kiloBytes / 1024;       // 1 MB = 1024 KB
        int remainKiloBytes = kiloBytes % 1024;

        System.out.println(kiloBytes+ " KB = " +megabytes+ " MB and " +remainKiloBytes+ " KB");
    }

}
