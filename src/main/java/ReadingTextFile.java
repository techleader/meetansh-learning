import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class ReadingTextFile {

    public static void main(String[] args) throws FileNotFoundException {

        File i = new File("C:\\Users\\ADMIN\\Desktop\\test.txt");
        Scanner scan = new Scanner(i);

        String[] splitStr;
        int totalWord = 0;
        while (scan.hasNextLine()) {

            String data = scan.nextLine();
            int count = data.length();
            String line = data;
            splitStr = line.split(" ");
            int wordCount = splitStr.length;
            totalWord=totalWord+wordCount;
            System.out.println(line.toUpperCase() + " = " + count + " - words = " + wordCount);

        }
        System.out.println("total word in the file are "+totalWord);

        }

    }

