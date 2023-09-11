import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.deepToString;

public class Main {
    public static void main(String[] args) {

        City kyiv = new City("Kyiv", List.of("Shevchenkivskyj", "Podilskyj"));
        City.District shevch = new City.District("Shevchenkivskyj", List.of("a", "a1"));
        City.District pod= new City.District("Podilskyj", List.of("b"));
        System.out.println(kyiv.toString() + City.districts);
        System.out.println("Streets of " + shevch.toString() + shevch.street);


        City lviv = new City("Lviv", List.of("Galyckyj","Frankivskyj"));
        City.District gal = new City.District("Galyckyj", List.of("c"));
        City.District fran= new City.District("Frankivskyj", List.of("d"));
        System.out.println(lviv.toString() + City.districts);


    }
}