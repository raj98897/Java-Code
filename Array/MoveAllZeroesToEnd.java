public class MoveAllZeroesToEnd {
    public static int[] array(int arr[]){
    int count = 0;    
    for(int i = 0; i < arr.length; i++){
        if(arr[i] != 0){
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
            count++;
        }
    }
    return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,0,0,4,5,0};
        int result[] = array(arr);
        for(int num : result){
            System.out.print(num+ " ");
        }
    }
    
}
