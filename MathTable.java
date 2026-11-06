package Fif.src;

public class MathTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%d * %d = %-2d\t", i, j, (i * j));
            }
            System.out.println();
        }
    }
}

