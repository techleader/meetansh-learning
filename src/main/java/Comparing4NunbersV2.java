import java.util.Scanner;

public class Comparing4NunbersV2 {

    public static void main(String[] args) {
        System.out.println("Please enter 4 digit num");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int max = a;

        if(max<b){
            max=b;
        }
        if(max<c){
            max=c;
        }
        if(max<d){
            max=d;
        }
        System.out.println(max);

        }

    }




