package HomeWork7;

public class Zoo {

    private Worker[] workers = new Worker[2];

    public void open() {
        IAnimal elephant = new Elephant(Food.GREEN);
        IAnimal tiger = new Tiger(Food.MEAT);
        elephant.said(new IVoice() {
            @Override
            public void voice() {
                System.out.println("I’m an Elephant");
            }
        });
        tiger.said(new IVoice() {
            @Override
            public void voice() {
                System.out.println("I’m an tiger");
            }
        });

        workers[0] = new Worker("Bob", elephant);
        workers[1] = new Worker("L-J", tiger);
    }

    public void dinner() {
        for (Worker worker : workers) {
            worker.feed();
        }
    }
}