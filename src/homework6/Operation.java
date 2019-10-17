package homework6;

    /*Створити інтерфейс Operation з одним методом calculate, який повертає double і примає два параметри
     тупу long.
     Створити класи Sum, Subtraction, Multiplication, Division, Power які реалізовують інтерфейс Operation.
     Створити Склас Calculator який буде мати один метод який буде повертати double і
     приймати Operation і запускати метод з інтерфейсу. В Main позапускати метод з Calculator з різними
     параметрами
     */

public interface Operation {
    double calculate(long a, long b);
}
