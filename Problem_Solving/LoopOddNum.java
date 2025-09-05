import java.util.Scanner;
public class LoopOddNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 0;
        while (true) {
            int num = sc.nextInt();
            N++;
            if(num%2 != 0){
                break;
            }
        }
        System.out.println(N);
        sc.close();
    }
    }
    

