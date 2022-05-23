package Module2;

public class Runner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("УАЗ", 4, 2019, "ВОЛЬВО");
        vehicle.move();
        vehicle.stop();
        Car niva = new Car("УАЗ", 4, 1987, "Lada", "JBL", "Samsung");
        niva.move(niva.getEngine());
        niva.move();
        niva.stop();
        Truck kraz = new Truck("КРАЗ", 10, 2021, "Yvaz", 1000);
        kraz.move(kraz.getCargoWeight());
        kraz.unloaded();
        kraz.move(kraz.getCargoWeight());
    }
}
