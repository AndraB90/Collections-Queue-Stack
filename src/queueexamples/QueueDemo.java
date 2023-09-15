package queueexamples;

import stackexamples.Person;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.offer(4);
        integerQueue.offer(3);
        integerQueue.offer(1);
        integerQueue.offer(33);
        integerQueue.offer(-5);

        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue.poll());

        Queue<Person> personQueue = new PriorityQueue<>();
        personQueue.offer(new Person("Alina", 45));
        personQueue.offer(new Person("Tibi", 22));
        personQueue.offer(new Person("Daniel", 30));

        System.out.println(personQueue.poll());
        System.out.println(personQueue.poll());
        System.out.println(personQueue.poll());

        //Pacienti care au un nume si un int priority
        //Spitale care au un queue de pacienti si un doctor
        //Obiect de tip doctor - o metoda treat patient
        //In Spital doctorul sa trateze toti pacientii

    }
}
