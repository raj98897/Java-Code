import java.util.*;
public class HappyNumber {
    public static boolean isHappy(int n){
        HashSet<Integer> seen = new HashSet<>();
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getSquareSum(n);
        }
        return n == 1;
    }
    public static int getSquareSum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;

        }
        return sum;
    }
    public static void main(String[] args){
        boolean result = isHappy(19);
        System.out.print(result);

    }
}