public class OneRPattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int ones = (i == 3) ? 1 : 2;
            int rs = (i == 1 || i == 3) ? 4 : 2;

            for (int j = 0; j < ones; j++) System.out.print("1 ");
            for (int j = 0; j < rs; j++) System.out.print("R ");
            System.out.println();
        }
    }
}
