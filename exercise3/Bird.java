package Chapter3Exercise.exercise3;

public class Bird implements Flight, Movement {
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

    // Walk method
    @Override
    public void walk(){
        System.out.println("I walk on my feet");
    }
    // Jump method
    @Override
    public void jump(){
        System.out.println("I jump by leaping from my feet");
    }

    // toString method
    @Override
    public String toString(){
        return "Bird [Type: " + type + "]: ";
    }
}
