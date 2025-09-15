import java.util.*;

public class AddingArray {
    static int[] calSum(int a[], int b[], int n, int m) {
        int i = n - 1;   // pointer for arr1
        int j = m - 1;   // pointer for arr2
        int carry = 0;

        // result can be at most max(n, m) + 1 digits
        int[] result = new int[Math.max(n, m) + 1];
        int k = result.length - 1; // pointer for result

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a[i--];
            if (j >= 0) sum += b[j--];

            result[k--] = sum % 10;
            carry = sum / 10;
        }

        // If the first digit is 0, skip it
        if (result[0] == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        sc.close();

        int[] res = calSum(arr1, arr2, n1, n2);
        for (int i : res) System.out.println(i);
    }
}
