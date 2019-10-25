package HomeWork7;

public class Elephant implements IAnimal {

    private Food food;

    public Elephant(Food food) {
        this.food = food;
    }

    public void eat() throws FoodException {
        if (food.equals(Food.GREEN)) {
            System.out.println("I like nuts");
        } else {
            throw new FoodException("Wrong type of food");
        }
    }

    @Override
    public void said(IVoice voice) {
        voice.voice();
    }
}