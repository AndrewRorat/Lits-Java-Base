package homeWork5.extendCarClass;

public class Main {
    public static void main(String[] args) {
        Car1950 car1950 = new Car1950(4, 4, "Steel");

        Car1970 car1970 = new Car1970(4, 4, "Steel", "FM radio",
                "There Are new innovation of safety");

        Car1990 car1990 = new Car1990(4, 4, "Steel", "FM, cassette radio",
                "There are seat belts", "There are 1 zone air conditioner", 2);

        Car2010 car2010 = new Car2010(4, 4, "Aluminium", "FM, cassette radio, DVD player",
                "There are seat belts", "There are 2 zone air conditioner",
                8, "There are 1 plasma screen", "There are bad navigation");

        Car2019 car2019 = new Car2019(4, 4, "Aluminium-carbon",
                "FM, cassette radio, DVD player, USB",
                "There are seat belts", "There are 4 zone air conditioner",
                16, "There are 4 Led screens", "There are good navigation", true);
    }
}