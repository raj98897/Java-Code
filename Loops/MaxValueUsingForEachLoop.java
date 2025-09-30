public class MaxValueUsingForEachLoop {
    public static void main(String[] args) {
        int marks[] = {123,43,45,65,75,87,21,234};
        int max = findMax(marks);
        System.out.println(max);
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int n1 : arr){
            if(n1 > max){
                max = n1;
            }
        }
        return max;
    }
    
}
