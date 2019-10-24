package HomeWork7;

public class Zoo {

    private Worker[] workers = new Worker[2];

    public void open(){
        workers[0] = new Worker("Bob", new Elephant(Food.GREEN));
        workers[1] = new Worker("L-j", new Tiger(Food.MEAT));
    }

    public void dinner() {
        for (Worker worker : workers) {
            worker.feed();
        }
    }
}