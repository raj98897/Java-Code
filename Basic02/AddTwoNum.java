import java.util.Scanner;
public class AddTwoNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input 
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        int sum = (num1 + num2);
        String result = String.format("The sum of %d and %d is %d",num1,num2,sum);
        System.out.println(result);

        sc.close();
        

    }
    
}
