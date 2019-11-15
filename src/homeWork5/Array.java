package homeWork5;

    /*Зробити клас Array який матиме методи: вивести елементи,
    заповнити масив, повернути суму всіх непарних індексів.
    Він має мати 2 наслідника: CharArray & IntegerArray
    */

import java.util.Random;

public class Array {
    public int[] array;

    public Array(int elements) {
        array = new int[elements];
    }

    public void outPutArrayElements() {
        for (int i : array) {
            System.out.println("Arrays elements: " + i);
        }
    }

    public void inputIntoArray(int bounds) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(bounds);
        }
    }

    public void sumOddIndexes() {
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                sumIndex += i;
            }
        }
        System.out.println(sumIndex);
    }
}