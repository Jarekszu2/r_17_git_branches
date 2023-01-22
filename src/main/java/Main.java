public class Main {
    public static void main(String[] args) {

        new MyFileWriter().saveToFile("Hallo World!");

        int numberOfLines = new MyFileReader().readFileAndReturnNumberOfLines();
        System.out.println(numberOfLines);
    }
}
