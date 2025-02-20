class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel < 0 || tonerLevel > 100){
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){

        if( (tonerAmount <= 0 || tonerAmount >= 100) || (tonerAmount+tonerLevel > 100) ){
            return -1;
        } else {
            tonerLevel += tonerAmount;
            return tonerLevel;
        }
    }

    public int printPages(int pages){

        int pagesToPrint = pages;

        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }

        this.pagesPrinted += pagesToPrint;

        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return pagesPrinted;
    }

}



public class program2 {

    public static void main(String[] args) {

    }

}
