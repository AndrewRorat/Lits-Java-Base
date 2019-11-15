package homework6.enumHomeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Arrays.stream(Cars.values()).map(Cars::getId).forEach(System.out::println);

        Arrays.stream(Cars.values()).map(Cars::getCountry).forEach(System.out::println);

        Arrays.stream(Cars.values()).map(Cars::getCode).forEach(System.out::println);

        System.out.println(Cars.findById(2));

        System.out.println(Cars.findByCountry("Italy"));

        System.out.println(Cars.finndByCode("BMW"));
    }
}