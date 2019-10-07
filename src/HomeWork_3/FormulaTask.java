package HomeWork_3;

/*У вас є формула : a+11/12(b+b)/12 і є символ, якшо символ ‘-’ ви ініціалізуєете змінні одними парамеитрами,
якшо ‘+’ то ще іншими і якшо ‘*’ іншими
 */

public class FormulaTask {
    public static void main(String[] args) {

        char symbol = '+';
        var result = 0;
        if (symbol == '+'){
            var a=5;
            var b=120;
            result = (a+11/12+(b+b)/12);
        }else if (symbol <= '-'){
            var a=5;
            var b=22;
            result = (a+11/12+(b+b)/12);
        }else if (symbol <= '*'){
            var a=5;
            var b=15;
            result = (a+11/12+(b+b)/12);
        }
        System.out.println(result);

    }
}
