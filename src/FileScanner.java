import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileScanner {

    public static void readAndScan(String filePath, String regex){
        File myFile = new File("Resources/alienUsername.txt");
        Scanner scan;

        try {
            scan = new Scanner(myFile);
            scan.nextLine();

            Pattern hackerPattern = Pattern.compile("^[\\_ | \\.]\\d+[a-zA-Z]*_?$");

            System.out.println(filePath + " regex is " + regex);

            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                Matcher matcher = hackerPattern.matcher(line);
                boolean matchFound = matcher.find();

                if(matchFound) {
                    System.out.println(line + " VALID");
                }
                else {
                    System.out.println(line + " INVALID");
                }
            }
            System.out.println("");
        }

        catch (Exception e) {
            System.out.println("File not found!");
        }
    }


}
