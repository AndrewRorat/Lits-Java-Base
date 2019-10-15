package homeWork5;

    /*IntegerArray має мати методи: повернути суму всіх елементів,
    повернути середнє занчення елементів, повернути суму всіх парних елементів
     */

public class IntegerArray extends Array {


    public IntegerArray(int elements) {
        super(elements);
    }

    public void sumAllElements(int elements){
        int sum = 0;
        inputIntoArray(elements);
        for (int i = 0; i<array.length; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public void averageValue(int arrayElements ,int number){
        inputIntoArray(arrayElements);
        int sum = 0;
        var average = 0;
        for (int i=0; i<array.length; i++){
            sum +=array[i];
            if (i == number){
                average = sum / number;
            }
        }
        System.out.println(average);
    }

    public void sumEvenElements(int arrayElements){
        inputIntoArray(arrayElements);
        var sum =0;
        for (int i = 0; i<array.length; i++){
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        System.out.println("Sum even elements: " + sum);
    }

}
