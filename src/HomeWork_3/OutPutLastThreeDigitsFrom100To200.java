package HomeWork_3;

    /*
    Вивести суму останніх трьох чисел від 100 до 200
     */

public class OutPutLastThreeDigitsFrom100To200 {
    public static void main(String[] args) {
        var numbers = 0;
        for (var i = 200; i >= 100; i--) {
            if (i >= 198) {
                numbers += i;
            } else if (numbers >= 198) {
                break;
            }
            System.out.println(numbers);
        }
    }
}