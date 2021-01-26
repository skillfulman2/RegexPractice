import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSpecificCharacters {

    public static void regexCheck() {

        String fileName ="Resources/matchingSpecificCharacter.txt";
        String regex = "^[1|2|3][1|2|0][x|s|0][3|0|A|a][x|s|u][\\,|\\.]$";

        FileScanner.readAndScan(fileName, regex);
    }
}
