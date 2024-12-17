public class SimpleCalculator {

    //Fields
    private double firstNumber;
    private double secondNumber;

    //Methods
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        double num1 = getFirstNumber();
        double num2 = getSecondNumber();
        return num1 + num2;
    }
    public double getSubtractionResult(){
        double num1 = getFirstNumber();
        double num2 = getSecondNumber();
        return  num1 - num2;
    }
    public double getMultiplicationResult(){
        double num1 = getFirstNumber();
        double num2 = getSecondNumber();
        return  num1 * num2;
    }
    public double getDivisionResult(){
        double num1 = getFirstNumber();
        double num2 = getSecondNumber();
        if(num2 == 0){
            return 0;
        }
        return  num1 / num2;
    }
}
