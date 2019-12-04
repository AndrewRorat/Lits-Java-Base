package homeWork12.famousBottle;

public class Main {
    public static void main(String[] args) throws BottleException {
        IBottle cocaCola = new CocaCola();
        IBottle sprite = new Sprite();
        IBottle pepsi = new Pepsi();

        sprite.bottle(0.2);

        cocaCola.bottle(0.5);

        pepsi.bottle(1.0);
    }
}