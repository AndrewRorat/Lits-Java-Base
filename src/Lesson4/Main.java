package Lesson4;

public class Main {
    public static void main(String[] args) {
//        int [] arr = new int[100];
//
//        for (int i=0; i<arr.length; i++){
//            arr [i] = new Random().nextInt(100);
//        }
//        for (int i : arr){
//            System.out.print(i);


        var person = new Person("John", 12, "Bryto");

        person.name = "John Snow";

        person.sayHallo();

        person.age=10;

    }
    }