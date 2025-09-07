class Hello{
    public static void main(String[] args){
        String name = "Raj Sharma"; // String declaration
        int age = 20; // Integer declaration
        
        System.out.println("My name is "+name+"."); // println is used to print the value in the next line
        //print is used to print the value in the same line

        // Floating-point
        double height = 5.7;
        String str_height = String.format("I'm %.1f foot tall.",height);
        System.out.println(str_height);

        // Multiple variables
        String str = String.format("My name is %s and I am %d years old.",name, age);
        System.out.println(str); // 
    }
}