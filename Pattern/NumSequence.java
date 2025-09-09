public class NumSequence {

    public static void main(String[] args) {
        int rows = 4;
        int cols = 3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print((cols * i + j) + " ");

            }

            System.out.print("\n");

        }
    }

}
