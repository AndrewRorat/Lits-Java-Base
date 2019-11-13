package homeWork12;

public enum BottlesEnum {

    SPRITE("Sprite"),
    COCACOLA("CocaCola"),
    PEPSI("Pepsi"),
    FANTA("Fanta");

    String name;

    BottlesEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
