package Chapter3Exercise.exercise2;

import java.util.ArrayList;

public class ThingsThatFly {
    public static void main(String[] args) {
        ArrayList<Flight> f = new ArrayList<>();

        f.add(new Airplane("Boeing", 2016));
        f.add(new Bird("Eagle"));
        f.add(new Bird("Hummingbird"));

        for (Flight flyers : f) {
            System.out.print(flyers.toString());
            flyers.fly();
        }
    }
}
