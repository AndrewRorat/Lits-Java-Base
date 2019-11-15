package homeWork14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyArrayList {
    private int bound;
    private List<Integer> arrayList = new ArrayList<>();
    private long start = System.currentTimeMillis();

    public MyArrayList(int bound) {
        this.bound = bound;
    }

    public void addinto() {
        for (int i = 0; i < bound; i++) {
            arrayList.add(i);
        }
        System.out.println("add arrayList" + start);
    }

    public void outPut(){
        int random = new Random().nextInt(bound);
        int number = arrayList.get(random);
        System.out.println("outPut arrayList " + number + start);
    }
}