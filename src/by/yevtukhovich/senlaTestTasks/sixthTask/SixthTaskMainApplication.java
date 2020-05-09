package by.yevtukhovich.senlaTestTasks.sixthTask;

import by.yevtukhovich.senlaTestTasks.sixthTask.entity.Backpack;
import by.yevtukhovich.senlaTestTasks.sixthTask.entity.Thing;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SixthTaskMainApplication {
    public static void main(String[] args) {

        Backpack backpack = new Backpack(150);

        Thing thing1 = new Thing(100, 1);
        Thing thing2 = new Thing(14, 6);
        Thing thing3 = new Thing(263, 73);
        Thing thing4 = new Thing(101, 123);
        Thing thing5 = new Thing(12, 26);

        List<Thing> things = Arrays.asList(thing1, thing2, thing3, thing4, thing5);

        packBackpack(backpack, things);
    }

    private static void packBackpack(Backpack backpack, List<Thing> things) {
        things.sort(Comparator.comparingDouble((Thing o) -> o.getWorth() / o.getWeight()).reversed());

        for (Thing thing : things) {
            backpack.addThing(thing);
        }
    }
}
