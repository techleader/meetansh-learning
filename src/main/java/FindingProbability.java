import java.util.Scanner;

public class FindingProbability {
    public static void main(String[] args) {
        System.out.println("Please write the total number");
        Scanner s= new Scanner(System.in);
        float t = s.nextInt();

        System.out.println("please write total number of outcomes");
        float o = s.nextInt();

        float q = o/t;

        float f = q*100;
        int total;
        total = Math.round(f);

        System.out.println(total+" % ");

    }
}
