package homeWork12;

public class Bottle<T extends String> {



    public Bottle() {

    }

    public void getCompanyBottle(T companyBottle) {
        if (companyBottle.equalsIgnoreCase(BottlesEnum.COCACOLA.name)) {
            System.out.println("It is " + companyBottle);
        }else if (companyBottle.equalsIgnoreCase(BottlesEnum.FANTA.name)) {
            System.out.println("It is " + companyBottle);
        }else if (companyBottle.equalsIgnoreCase(BottlesEnum.SPRITE.name)) {
            System.out.println("It is " + companyBottle);
        }else if (companyBottle.equalsIgnoreCase(BottlesEnum.PEPSI.name)) {
            System.out.println("It is " + companyBottle);
        } else {
            System.out.println("Wrong type of bottle industry");
        }
    }


}
