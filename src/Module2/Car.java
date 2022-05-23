package Module2;

public class Car extends Vehicle{
    private String audioSystem;
    private String conditioner;

    public Car(String engine, int countWheels, int year, String model, String audioSystem, String conditioner) {
        super(engine, countWheels, year, model);
        this.audioSystem = audioSystem;
        this.conditioner = conditioner;
        System.out.println(model + " created");
    }

    public void move(String engine) {
        System.out.println("Машина с двигателем" + engine + " едет быстро");
    }

    public void oneConditioner() {
        System.out.println("Включился кондиционер");
    }

    public void oneAudioSystem() {
        System.out.println("Заиграла музыка");
    }

    public String getAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(String audioSystem) {
        this.audioSystem = audioSystem;
    }

    public String getConditioner() {
        return conditioner;
    }

    public void setConditioner(String conditioner) {
        this.conditioner = conditioner;
    }
}
