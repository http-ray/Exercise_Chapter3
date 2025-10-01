package Chapter3Exercise.exercise3;

import java.util.ArrayList;

public class ThingsThatMove {
    public static void main(String[] args) {
        ArrayList<Movement> f = new ArrayList<>();

        f.add(new Airplane("Boeing", 2016));
        f.add(new Bird("Eagle"));
        f.add(new Bird("Hummingbird"));

        for (Movement flyers : f) {
            System.out.print(flyers.toString());
            flyers.fly();
            flyers.walk();
            flyers.jump();
        }
    }
}
