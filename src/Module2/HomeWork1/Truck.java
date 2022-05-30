package Module2.HomeWork1;

public class Truck extends Vehicle {
    private int cargoWeight;

    public Truck(String engine, int countWheels, int year, String model, int cargoWeight) {
        super(engine, countWheels, year, model);
        this.cargoWeight = cargoWeight;
        System.out.println(model + " created");

    }

    public void move(int cargoWeight) {
        System.out.println("Грузовик везет " + cargoWeight + " кг");
    }

    public void unloaded() {
        setCargoWeight(0);
        System.out.println("Грузовик разгрузился, груз равен " + cargoWeight);
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
