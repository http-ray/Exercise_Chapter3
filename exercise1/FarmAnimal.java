package Chapter3Exercise.exercise1;

public abstract class FarmAnimal {
    // Attributes
    private String name;
    private String gender;
    private double weight;
    private int age;

    // Constructor
    public FarmAnimal(String name, String gender, double weight, int age){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // toString
    @Override
    public String toString() {
       return "[Name: " + name + ", Gender: " + gender + ", Weight: " + weight + ", Age: " + age + "]";
    }

    // AbstractMethod
    public abstract String feedLoadingSchedule();
}
