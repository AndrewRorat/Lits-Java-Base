package HomeWork_4;

public class ArrayRealisation {
    public static void main(String[] args) {
        Array array = new Array(10);

        array.into();
        array.sortByEvenDigits();
        System.out.println("Sorted by even digits: " + array.getSortByEvenDigits());
        array.sortByOddIndex();
        System.out.println("Odd index sorted: " + array.getOddIndexSortedArray());
        array.bubbleSorting();
        System.out.println("Bubble sorted array: " + array.getBubbleSortedArray());
        array.replacementEvenDigits(10);
    }
}
