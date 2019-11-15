package lesson6;

public class Zoo {

    private Animal animal;

    public Zoo(Animal animal) {
        this.animal=animal;
    }

    public void doSmth(){
        animal.action();
    }
}
