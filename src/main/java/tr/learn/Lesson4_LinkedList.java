package tr.learn;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lesson4_LinkedList {
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

        MyLinkedList.Node node = new MyLinkedList.Node();
        MyLinkedList myLinkedList = new MyLinkedList(node);
        myLinkedList.addNode(new MyLinkedList.Node());
        myLinkedList.addNode(new MyLinkedList.Node());
        myLinkedList.addNode(new MyLinkedList.Node());
        myLinkedList.addNode(new MyLinkedList.Node());
//        myLinkedList.addNode(node);
        System.out.println(MyLinkedList.isRecourse());
    }
}

class MyLinkedList {
    static Node headNode;
    Node node;
    static int length = 0;

    public MyLinkedList(Node node) {
        headNode = node;
        this.node = node;
        node.index = ++length;
    }
    void addNode(Node node) {
        node.index = ++length;
        this.node.next = node;
        this.node = node;
    }

    static boolean isRecourse() {
        Node fst = headNode;
        Node scd = headNode;
        int index = 0;
        while (length > index && scd.next != null) {
            fst = fst.next;
            scd = scd.next.next;
            if (fst == scd) {
                return false;
            }
        }
        return true;
    }

    static class Node {
        Node next;
        int index;
    }
}
