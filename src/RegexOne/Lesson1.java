package RegexOne;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson1 {  //https://regexone.com/lesson/character_ranges?

    public static void main(String[] args) throws FileNotFoundException {
        OutputStream outputStream = new FileOutputStream("C:\\Java\\IdeaProjects\\Problem\\src\\RegexOne\\TestFile");
        PrintWriter pw = new PrintWriter(outputStream);
        pw.println(100000);
        pw.close();

    }
}
