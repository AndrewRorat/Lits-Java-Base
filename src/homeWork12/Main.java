package homeWork12;

    /*
    1)викинути StackOverflow за допомогою рекурсії
    2)Зробити клас бутилка, яка може бути бутилкою з:
    кола,пепсі,фанти,спрайт. Памятаймо шо це бренди і вони не є змінними
     */

public class Main {

    public void maine(){
        maine();
    }


    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        bottle.getCompanyBottle("Fanta");
    }
}
