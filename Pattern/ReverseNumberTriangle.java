public class ReverseNumberTriangle {
    public static void printPattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=i; j<=n; j++){
                System.out.print(j + " ");
            }
        System.out.println();
        }
        
        
    }
    public static void main(String[] args) {
        int n = 6;
        printPattern(n);
    }
    
}
