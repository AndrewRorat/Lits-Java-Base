package HomeWork7;

import static HomeWork7.Food.*;

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

        Zoo zoo = new Zoo();
        zoo.open();
        zoo.dinner();





//        Worker worker = new Worker();
//        worker.setAnimal(e);
    }

}
