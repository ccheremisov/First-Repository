package Module2.HomeWork1;

public class Vehicle {
    private String engine;
    private int countWheels;
    private int year;
    private String model;

    public Vehicle() {
    }

    public Vehicle(String engine, int countWheels, int year, String model) {
        this.engine = engine;
        this.countWheels = countWheels;
        this.year = year;
        this.model = model;
        System.out.println("Vehicle created");
    }

    public void move() {
        System.out.println("Транспорное средство поехало");
    }

    public void stop() {
        System.out.println("Транспортное средство остановилось");
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
