public class DiamondStarPattern {
    public static void printPattern(int n) {
        // for upper part
     for(int i=1; i<=n; i++){
        for(int j=1; j<= n -i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1; j+=1){
            System.out.print("*");
        }
        System.out.print("\n");
     }
     // for lower part
     
     for( int i=n-1; i >= 1; i--){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
     }

    }
    public static void main(String[] args) {
        int n = 5;
        printPattern(n);
    }
    
}
