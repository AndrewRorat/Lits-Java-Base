package homeWork9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public void polindrom(){
        String text = "ABBA";
        StringBuilder rev = new StringBuilder(text).reverse();
        String revToString = rev.toString();
        System.out.println(text.equalsIgnoreCase(revToString));
    }
    public static void main(String[] args) {
        String number = "+380632594764";
        Pattern pattern = Pattern.compile("(\\+\\d{2})(\\({1}\\d{3}\\))(\\d{7})");
        Matcher match = pattern.matcher(number);
        System.out.println(match.toString());

        String email = "rorat6937@gmail.com";
        Pattern pattern1 = Pattern.compile("(\\w+)(\\@{1})([a-z]+\\.+)([a-z]{2,5})");

        String types = "input class=“regex”";
        Pattern pattern2 = Pattern.compile("([a-z]+\\s{1})([a-z]+\\={1})");
        Matcher matcheTypes = pattern2.matcher(types);
        System.out.println(matcheTypes.toString());

    }
}
