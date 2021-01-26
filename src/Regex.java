public class Regex {

    private String fileName;
    private String regex;

    public Regex(String fileName, String regex) {
        this.fileName = fileName;
        this.regex = regex;
    }

    public void regexCheck() {
        FileScanner.readAndScan(this.fileName, this.regex);
    }

}
