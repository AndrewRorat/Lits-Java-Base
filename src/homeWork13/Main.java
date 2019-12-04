package homeWork13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final Pattern vowelPattern = Pattern.compile("[aeiouyAEIOYU]");
    private static final Pattern consonantPattern = Pattern.compile("[^aeiouyAEIOYU]");
    private String text;

    public Main(String text) {
        this.text = text;
    }

    private void outPutVowelLetters(){
        Matcher matcher = vowelPattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

    }
    private void outPutConsonantLetters(){
        Matcher matcher = consonantPattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }

    public static void main(String[] args) {
        Main main = new Main("xpowefhjiWAOBVC");
        main.outPutVowelLetters();
        main.outPutConsonantLetters();
    }
}