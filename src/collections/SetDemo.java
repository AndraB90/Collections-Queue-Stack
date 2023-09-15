package collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        for (Integer i: set) {
            System.out.println(i);
        }

        Set<Person>personSet = new HashSet<>();
        personSet.add(new Person(23, "Elena"));
        personSet.add(new Person(44, "Ioan"));
        personSet.add(new Person(23, "Elena"));

        for (Person i: personSet) {
            System.out.println(i);
        }

    }
}
