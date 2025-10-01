package Chapter3Exercise.exercise1;

import java.util.ArrayList;

public class MyFarm {
    public static void main(String[] args) {
        // ArrayList of Farm Animals
        ArrayList<FarmAnimal> animals = new ArrayList<>();

        // create animals
        animals.add(new Duck("Donald", "male", 3.2, 5, "Quack Quack"));
        animals.add(new Duck("Cheese", "female", 3.6, 5, "Quack Quack"));
        animals.add(new Cow("Moly", "female", 1600.0, 3, "Moo Moo"));
        animals.add(new Chicken("Albert", "male", 1.6, 2, "Cock-a-Doodle-doo"));
        animals.add(new Chicken("Amelia", "female", 1.8, 4, "Cluck Cluck"));
        animals.add(new Chicken("Dixie", "female", 1.7, 4, "Cluck Cluck"));

        // print animal info
        for (FarmAnimal a : animals) {
            System.out.println(a);
        }
        // print animal schedule
        for (FarmAnimal a: animals) {
            System.out.println(a.feedLoadingSchedule());
        }

    }
}
