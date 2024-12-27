public class Mitsubishi extends Car {

    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.print("Mitsubishi -> ");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.print("Mitsubishi -> ");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.print("Mitsubishi -> ");
        super.brake();
    }

}
