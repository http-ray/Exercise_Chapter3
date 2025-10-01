package Chapter3Exercise.exercise3;

public class Airplane implements Flight, Movement{
    // Attributes
    private String model;
    private int year;

    // Constructor
    public Airplane(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Getters and Setters
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

    // Fly method
    @Override
    public void fly() {
        System.out.println("I’m an airplane that relies on an engine to fly.");
    }

    // Walk method
    @Override
    public void walk(){
        System.out.println("I tax on my wheels");
    }
    // Jump method
    @Override
    public void jump(){
        System.out.println("I cannot jump");
    }

    // toString method
    @Override
    public String toString(){
        return "Airplane [Model: " + model + ", Year: " + year + "]: ";
    }
}
