abstract class Vehicle{
    public abstract void engine();
    public void Horn(){
        System.out.println("Pee PEee...");
    }
}
class BMW extends Vehicle{

    @Override
    public void engine() {
        System.out.println("4000 cc Engine...");
    }
}
public class abstractDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new BMW();
        vehicle.engine();
        vehicle.Horn();
    }

}
