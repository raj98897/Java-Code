public class ForEachLoop {
    public static void main(String[] args){
        // int arr[] = {2,3,45,6,7};
        // for(int e : arr){
        //     System.out.print(e + " ");
        // }

        // 2D Array
        int arr[][] = new int[3][3];
        for(int[] row : arr){
            for(int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
