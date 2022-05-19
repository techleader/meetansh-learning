import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {
        int n;
        System.out.println("Please enter any number");
        Scanner scan = new Scanner(System.in);
         n = scan.nextInt();

        for(int i=1; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i);
            }

        }
    }

    public static boolean isPrime(int number) {
        boolean result = false;

        int count=0;
        for (int i =1; i<=number; i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==2){
            result = true;
        }

        return result;
    }
}
