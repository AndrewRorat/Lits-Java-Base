package HomeWork7;

import java.util.Scanner;

    /*Зоопарк
    Створити класи Human, animal, Food, Zoo.
    Zoo буде мати масив працівників і метод відкриття, під час відкриття кожному
    працівникові делегується покормити якусь худобу і метод обід в якому кожен працівник має покормити свою тварину.
    Human буде мати тварину за якою дивиться і метод покормити який приймає їжу. Animal - має метод їсти,
    в цьому методі потрібно зробити перевірку на назву їжі
    якщо їжа не підходить вивести “Я не їм <назва їжі>” в іншому випадку смакота.
    Food - кожен тип їжі має мати назву і все.
     */

public class Main {
    public static void main(String[] args) throws FoodException {

        Scanner scan = new Scanner(System.in);
        Zoo zoo = new Zoo();
        System.out.println("Please enter if you want to open ZOO: 'Yes' or 'No': ");
        String input = scan.nextLine();
        if ("yes".equalsIgnoreCase(input)) {
            zoo.open();
            System.out.println("Animals are hungry, please feed them entering the command 'dinner'");
            if ("dinner".equalsIgnoreCase(scan.nextLine())) {
                zoo.dinner();
            } else {
                System.out.println("Wrong command");
                scan.close();
            }
        } else if ("no".equalsIgnoreCase(input)) {
            System.out.println("You choose don’t open ZOO");

        } else {
            System.out.println("Your command: "+ input +" is baaaaaad!!!");
        }scan.close();
    }
}