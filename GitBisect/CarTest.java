

public class CarTest {
    public static void main(String args[]) {
       Car c = new Car(10,"Tesla");
       System.out.println(c.getGasInTank());
       c.addGas(10);
       c.drive(10);
       System.out.println(c.getGasInTank());
    }
}
