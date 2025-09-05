import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if (num < 2){
            isPrime = false; // numbers less than 2 are not prime.
        }else{
            for(int i = 2; i*i < num;i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num +" is a prime number.");
        }else{
            System.out.println(num +" is not a prime number.");
        }
        sc.close();
    }
    
}


// if(n == 1) return false;
// for(int i = 2; i*i <= n; i++){
// if(n%i == 0) return false;
//}
//return true;