package HomeWork_3;

    /*
    Згенерувати рандомне число від 0до 10
    і вивести всі числа від 0 до 100 які діляться націло на нього
     */

import java.util.Random;

public class BalanceOfRandomNumberFrom0To10 {
    public static void main(String[] args) {
        var randomDigit = new Random().nextInt(10);
        for (var i = 0; i <= 100; i++){
            if (i % randomDigit == 0){
                System.out.println(i);
            }else if (randomDigit <= 0){
                System.out.println("0 is not dividing on 0");
            }
        }
        System.out.println("Random digit is: " + randomDigit);
    }
}