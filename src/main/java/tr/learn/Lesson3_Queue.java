package tr.learn;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lesson3_Queue {
    static Queue<Integer> q = new PriorityQueue<>();

    public static void main(String[] args) {
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.peek());
        q.poll();
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.peek());
        q.poll();
    }

}
