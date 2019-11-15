package homeWork14;

import java.util.LinkedList;

public class Queue {
    public static void main(String[] args) {
        LinkedList<String> fifo = new LinkedList<>();
        fifo.add("Robert");
        fifo.add("Max");
        fifo.add("Tim");
        fifo.add("Preesciella");
        fifo.add("Mia");
        fifo.add("Vova");
        fifo.add("Andrew");
        fifo.add("Taras");

        System.out.println(fifo.getFirst());


        LinkedList<String> lifo = new LinkedList<>();
        lifo.add("Robert");
        lifo.add("Max");
        lifo.add("Tim");
        lifo.add("Preesciella");
        lifo.add("Mia");
        lifo.add("Vova");
        lifo.add("Andrew");
        lifo.add("Taras");

        System.out.println(lifo.getLast());

    }
}