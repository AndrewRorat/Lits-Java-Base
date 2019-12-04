package homeWork14;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyLinkedList {
    private int bound;
    private List<Integer> linkedList = new LinkedList<>();
    private long start = System.currentTimeMillis();

    public MyLinkedList(int bound) {
        this.bound = bound;
    }

    public void addinto() {
        for (int i = 0; i <= bound; i++) {
            linkedList.add(i);
        }
        System.out.println("add linkedList " + start);
    }

    public void outPut(){
        int random = new Random().nextInt(bound);
        int number = linkedList.get(random);
        System.out.println("outPut LinkedList "+ number + start);
        }
}