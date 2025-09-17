public class ReverseAnArray {
    public static int[] ReverseArray(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[] = {3,23,11,4,5,7,8,9,10};
        int result[] = ReverseArray(arr);
        for(int num : result){
            System.out.print(num+" ");
        } 
    }
    
}
