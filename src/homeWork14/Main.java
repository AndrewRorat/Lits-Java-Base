package homeWork14;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList(100000);
        MyArrayList arrayList = new MyArrayList(100000);

        linkedList.addinto();
        arrayList.addinto();

        linkedList.outPut();
        arrayList.outPut();
    }
}
