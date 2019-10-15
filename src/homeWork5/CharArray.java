package homeWork5;

    /*CharArray має мати методи: ввести символ через аргумент і перевірити чи символ є в масиві,
    вивести масив числових значень всіх chars
     */

public class CharArray extends Array {

    public CharArray(int elements) {
        super(elements);
    }

    public void inputSymbolAndCheckIt(int elements, int index, int valueOfIndex) {
        inputIntoArray(elements);
        array[index] = valueOfIndex;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
            }
            if (array[i] == valueOfIndex) {
                System.out.println(valueOfIndex);
            }

        }
    }

    public void outPutAllValues(int elements) {
        char[] array = new char[elements];
        for (char i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (char i : array) {
            System.out.println(i);
        }
    }
}