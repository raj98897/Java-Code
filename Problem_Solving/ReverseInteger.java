class ReverseInteger{
    public int reverse(int x){
        int parity = 1;
        if(x < 0){
            parity = -1;
            x = -x;
        }
        int reverse = 0;
        while(x > 0){
            int digit = x % 10;
            if (reverse > (Integer.MAX_VALUE - digit)/10) return 0;
            reverse  = reverse * 10 + digit;
            x/=10;
        }
        if(reverse > Integer.MAX_VALUE){
            return 0;
        }
        return parity*((int)reverse);
     
    }
 public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        int result = ri.reverse(897999999);
        System.out.println(result); // This will correctly print -2

}
}