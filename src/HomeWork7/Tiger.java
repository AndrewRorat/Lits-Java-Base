package HomeWork7;

public class Tiger implements IAnimal {

    private Food food;


    public Tiger(Food food) {
        this.food = food;
    }

    @Override
    public void eat() throws FoodException {
        if (food.equals(Food.MEAT)) {
            System.out.println("Delicious");
        } else {
            throw new FoodException("Wrong type of food");
        }
    }
}