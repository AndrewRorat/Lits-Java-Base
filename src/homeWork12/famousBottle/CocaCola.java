package homeWork12.famousBottle;

public class CocaCola implements IBottle {

    private final double MINIMUM_VOLUME = 0.3;
    private final String NAME_OF_BOTTLE = "CocaCola";

    public CocaCola() {
    }

    @Override
    public void bottle(double volume) throws BottleException {
        if (volume >= 0.3) {
            System.out.print("This is " + volume + " bottle of " + NAME_OF_BOTTLE + " drink.\n");
        } else {
            throw new BottleException("Wrong volume of " + NAME_OF_BOTTLE + " bottle. " +
                    "It must be more than " + MINIMUM_VOLUME);
        }
    }
}