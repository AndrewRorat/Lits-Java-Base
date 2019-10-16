package homeWork5.extendCarClass;

public class Car2010 extends Car1990 {
    private String screen;
    private String navigation;

    public Car2010(int wheels, int seats, String carBody, String radio, String areSeatBelt,
                   String airConditioner, int airBags, String screen, String navigation) {
        super(wheels, seats, carBody, radio, areSeatBelt, airConditioner, airBags);
        this.screen = screen;
        this.navigation = navigation;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getNavigation() {
        return navigation;
    }

    public void setNavigation(String navigation) {
        this.navigation = navigation;
    }
}