public class FormatBoolChar {
    public static void main(String[] args) {
        boolean flag = true;
        char grade = 'A';

        String result = String.format("Pass: %b, Grade: %c",flag,grade);
        System.out.println(result);
    }   
}
