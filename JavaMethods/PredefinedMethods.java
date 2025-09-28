import java.util.*;
public class PredefinedMethods {
    // String Methods
    public static void StringMethods(){
        String str = "I'm learning Java methods.";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(0));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("m"));
        System.out.println(str.replace("m","M"));
    }

    // MathMethods
    public static void MathMethods(){
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(2,10));
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(23, 40));
        System.out.println(Math.min(20, 19));
        System.out.println(Math.random()*1000);
        System.out.println(Math.round(4.5));
    }
    public static void ArraysMethods(){
        int arr[] = {2,5,3,4,8,6,9,10,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, 8);
        System.out.println(index);

        int[] copy = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(copy)); 
    }

    // Collection Methods
    public static void CollectionMethods(){
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 1, 9, 3));
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);
    }

    // Wrapper class methods
    public static void WrapperMethods(){
        int num = Integer.parseInt("100");
        String str = Integer.toString(100);
        double d = Double.parseDouble("25.23");
        System.out.println(num);
        System.out.println(str);
        System.out.println(d);
    }

    public static void main(String[] args) {
       // StringMethods();
    //    MathMethods();
        // ArraysMethods();
        // CollectionMethods();
        WrapperMethods();
    }


    
}
