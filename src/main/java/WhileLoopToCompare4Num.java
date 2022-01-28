import java.util.Scanner;

public class WhileLoopToCompare4Num {
    public static void main(String[] args) {
        System.out.println("Please enter any 4 number");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int min = a;
        int[] v = {a,b,c,d};
        int i= 1;

        while(i<=3) {
            if(min>v[i]){
                min=v[i];
            }

            i = i+1;
        }
        System.out.println(min);

    }
}
