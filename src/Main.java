import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Regex alienUsername = new Regex("alienUsername.txt","^[\\_ | \\.]\\d+[a-zA-Z]*_?$");
        alienUsername.regexCheck();

        Regex matchingSpecificCharacter = new Regex("matchingSpecificCharacter.txt", "^[1|2|3][1|2|0][x|s|0][3|0|A|a][x|s|u][\\,|\\.]$");
        matchingSpecificCharacter.regexCheck();

        String exSpecChar = "^\\D[^aeiou][^bcDF][^\\s][^AEIOU][^\\.\\,]$";
        Regex excludingSpecificCharacters = new Regex("matchingSpecificCharacter.txt", exSpecChar);



    }
}
