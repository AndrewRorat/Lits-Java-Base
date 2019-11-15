package HomeWork7;

public class Worker {

    private String worker;
    private IAnimal animal;

    public Worker(String worker, IAnimal animal) {
        this.worker = worker;
        this.animal = animal;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(IAnimal animal) {
        this.worker = worker;

    }

    public void feed() {
        try {
            animal.eat();
        } catch (FoodException e) {
            e.printStackTrace();
        }
    }
}