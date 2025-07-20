public class WhilePattern {
    public static void main(String[] args) {
        int row = 1, num = 1, count = 1;

        while (row++ <= 5) {
            int i = 0;
            while (i++ < count) System.out.print(num++ + " ");
            i = 0;
            while (i++ < count) System.out.print("w ");
            System.out.println();
            count += (row <= 3) ? 1 : -1;
        }
    }
}
