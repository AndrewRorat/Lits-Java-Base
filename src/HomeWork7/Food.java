package HomeWork7;

public enum Food {
    MEAT("CHICKEN"),
    GREEN("NUTS");

    String kindOfFood;

    Food(String kindOfFood) {
        this.kindOfFood = kindOfFood;
    }

    public String getKindOfFood() {
        return kindOfFood;
    }

}
