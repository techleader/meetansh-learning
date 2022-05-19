import java.util.Scanner;

public class CalculatingPercentage {
    public static void main(String[] args) {
        System.out.println("How many percent do you want to calculate ?");
        Scanner scan = new Scanner(System.in);
        float per = scan.nextInt();

        System.out.println("percent of which number");
        int num = scan.nextInt();

        float total =(per/100 * num);

        System.out.println(per+" % percent of "+ num +" is " +total);

    }
}
