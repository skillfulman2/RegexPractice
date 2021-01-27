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


        // ^ inside brackets is like NOT
        String exSpecChar = "^\\D[^aeiou][^bcDF][^\\s][^AEIOU][^\\.\\,]$";
        Regex excludingSpecificCharacters = new Regex("matchingSpecificCharacter.txt", exSpecChar);

        String matchingCharacterRange = "^[a-z][1-9][^a-z][^A-Z][A-Z]";

        //https://www.hackerrank.com/challenges/matching-one-or-more-repititions/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
        String oneOrMoreRepetitions = "^\\d+[A-Z]+[a-z]+$";

        // https://www.hackerrank.com/challenges/matching-ending-items/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
        String matchingEndingItems = "^[a-zA-Z]*s$";

        // https://www.hackerrank.com/challenges/backreferences-to-failed-groups/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
        String backReferencesToFailedGroups =
    }
}
