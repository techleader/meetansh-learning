import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DJGHKJGH {
    public static void main(String[] args) throws FileNotFoundException {

        File i = new File("C:\\Users\\ADMIN\\Desktop\\test.txt");
        Scanner scan = new Scanner(i);

        String[] splittedStr;
        while (scan.hasNextLine()) {

            String data = scan.nextLine();

            System.out.println(data);

            String[] s;
            s = data.split(" ");
            System.out.println(s);

        }
    }
}