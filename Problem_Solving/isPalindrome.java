import java.util.Scanner;
public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n/=10;
        }
        if(rev == original){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        sc.close();
    }}
    

