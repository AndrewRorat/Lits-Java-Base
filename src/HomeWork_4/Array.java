package HomeWork_4;

    /*
    Зробити класс Array, він має містити масив і ініціалізуватись через конструктор
    ( або просто розмір задати або цілий масив)
    Має мати методи: просортувати, вивести парні елементи, вивести елементи непарних індексів,
    повернути просортований масив, передати через аргумент значення, яким ви заміните всі парні елементи,
    і метод який буде рандомно заповнювати числами.
    2) Завдання зробити клас Фігура з методами параметр і площа, методи нехай будуть поки пусті
    */

import java.util.Random;

public class Array {
    public int[] array;

    public Array(int elements) {
        array = new int[elements];
    }

    public void into() {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(200);
        }
    }

    public void sortByEvenDigits() {
        into();
        int element;
        for (int i = 0; i < array.length; i++) {
            element = array[i];
            if (element % 2 == 0) {
                System.out.println("Sort by even digits: " + element);
            }
        }
    }

    public int[] getSortByEvenDigits() {
        sortByEvenDigits();
        for (int i : array) {
            System.out.println(i);
        }
        return array;
    }

    public void sortByOddIndex() {
        into();
        int element = 0;
        for (int i = 0; i < array.length; i++) {
            element = array[i];
            if (i % 2 != 0) {
                element = i;
            }

        }
    }


    public void bubbleSorting() {
        into();
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int num = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num;
                }
            }
        }
    }

    public int[] getBubbleSortedArray() {
        bubbleSorting();
        for (int i : array) {
            System.out.println(i);
        }
        return array;
    }

    public int[] getOddIndexSortedArray() {
        sortByOddIndex();
        for (int o : array) {
            System.out.println(o);
        }
        return array;
    }

    public void replacementEvenDigits(int argumentForReplace) {
        into();
        for (int i : array) {
            if (i % 2 == 0) {
                i = argumentForReplace;
                System.out.println(i);
            }
        }
    }
}