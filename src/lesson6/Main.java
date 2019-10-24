package lesson6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Bird();

        Zoo zoo = new Zoo(animal);

        zoo.doSmth();
    }
}
