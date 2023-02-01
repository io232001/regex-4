package it.develhope.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start{
    public static void main(String[] args) {
        String input = "x3z ? xYz ! R1 && __";
        String pattern = "[a-z0-9]";
        String replace = "*";
        String output = input.replaceAll(pattern, replace);
        System.out.println(output);
    }
}


