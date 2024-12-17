public class Holden extends Car{

    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.print("Holden -> ");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.print("Holden -> ");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.print("Holden -> ");
        super.brake();
    }
}
