package tack3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Animals, List<Pet> > petMap = new HashMap<>();
        petMap.put(Animals.DOG, Arrays.asList(new Dog("Nelya")));
        petMap.put(Animals.PARROT, Arrays.asList(new Parrot("Elya")));

        System.out.println(petMap);
        System.out.println(petMap.keySet());


    }
}
