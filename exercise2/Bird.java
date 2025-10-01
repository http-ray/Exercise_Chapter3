package Chapter3Exercise.exercise2;

public class Bird implements Flight{
    // Attributes
    private String type;

    // Constructor
    public Bird(String type) {
        this.type = type;
    }

    // Getter and Setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Fly method
    @Override
    public void fly(){
        System.out.println("I’m a bird who flaps wings to fly.");
    }

    // toString method
    @Override
    public String toString(){
        return "Bird [Type: " + type + "]: ";
    }
}
