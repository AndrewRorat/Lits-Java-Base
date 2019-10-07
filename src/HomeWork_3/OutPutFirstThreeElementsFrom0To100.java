package HomeWork_3;

    /*
    Вивести суму перших трьох елементів від 0 до 100
     */

public class OutPutFirstThreeElementsFrom0To100 {
    public static void main(String[] args) {
        var numbers = 0;
        for (var i = 1; i <= 100; i++) {
            if (i <= 3) {
                numbers += i;
            }
        }
        System.out.println(numbers);
    }
}