import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlienUsername {

    public static void regexCheck() {
        String fileName =  "Resources/alienUsername.txt";
        String regex = ("^[\\_ | \\.]\\d+[a-zA-Z]*_?$");

        FileScanner.readAndScan(fileName, regex);
    }

}
