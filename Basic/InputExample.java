import java.util.Scanner;
public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input 
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        // Output in table format
        String header = String.format("%-10s %-10s %-10s","Name","Roll","Marks");
        String row = String.format("%-10s %-10d %-10.2f",name,roll,marks);

        System.out.println(header);
        System.out.println(row);
        sc.close();
    }
    
}