package Chapter3Exercise.exercise1;

public class Chicken extends FarmAnimal {
    // Attribute
    private String sound;

    // Constructor
    public Chicken(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    // Getter and Setter
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    // toString
    @Override
    public String toString() {
        return "Chicken " + sound + " " + super.toString();
    }

    // Feeding Schedule
    @Override
    public String feedLoadingSchedule() {
        return getName() + ": 8am-4pm";
    }
}
