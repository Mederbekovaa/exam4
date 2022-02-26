package tack1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Character> hashSet = new HashSet<>();
        hashSet.add('1');
        hashSet.add('2');
        hashSet.add('3');
        hashSet.add('4');
        hashSet.add('4');
        hashSet.add('5');
        System.out.println(hashSet);
    }
}