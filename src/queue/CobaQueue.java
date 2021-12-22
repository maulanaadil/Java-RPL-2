package queue;

import java.util.PriorityQueue;

public class CobaQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> bilangan =  new PriorityQueue<>();


        for (int i = 1; i<=5; i++) {
            bilangan.add(i);
        }

        bilangan.forEach(System.out::println);
    }
}
