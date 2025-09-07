import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input 
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter ypur age: ");
        int age = sc.nextInt();

        // Output using String format
        String result = String.format("Hello %s, you are %d years old.",name,age);
        System.out.println(result);
        sc.close();
    }
    
   
}
