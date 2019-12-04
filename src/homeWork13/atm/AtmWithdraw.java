package homeWork13.atm;

import java.util.Scanner;

public class AtmWithdraw {
    public static void main(String[] args) {
        int[] banknotes = {10,20, 50, 100, 200, 500};
        int number = banknotes.length-1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cash you want.");
        int withdraw = scanner.nextInt();
        while (number >= 0)
            if (banknotes[number] > withdraw)
                number--;
            else {
                System.out.println(banknotes[number]);
                withdraw -= banknotes[number];
            }
    }
}