import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        File myFile = new File("Resources/input.txt");
        Scanner scan;

        try {
            scan = new Scanner(myFile);
            scan.nextLine();

            Pattern hackerPattern = Pattern.compile("^[\\_ | \\.]\\d+[a-zA-Z]*_?");



            while(scan.hasNextLine()) {
                Matcher matcher = hackerPattern.matcher(scan.nextLine());
                boolean matchFound = matcher.find();

                if(matchFound) {
                    System.out.println("VALID");
                }
                else {
                    System.out.println("INVALID");
                }
            }
        }

        catch (Exception e) {
            System.out.println("File not found!");
        }



    }
}
