package oraimunka_2024_02_22;

import java.util.Random;

public class feladat2 {

    static Random rnd = new Random();

    public static void main(String[] args) {
        String[] betuk = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        System.out.println("Stringel");
        for (int i = 0; i < betuk.length; i++) {
            if (i % 3 == 2) {
                System.out.printf("%s\n", betuk[i]);
            } else {
                System.out.printf("%s ", betuk[i]);
            }
        }
        System.out.println("Char-ral");
        char[] betuk2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        for (int i = 0; i < betuk2.length; i++) {
            if (i % 3 == 2) {
                System.out.printf("%s\n", betuk2[i]);
            } else {
                System.out.printf("%s ", betuk2[i]);
            }
        }
        System.out.println("random");
        char[] betuk3 = new char[9];
        for (int i = 0; i < betuk3.length; i++) {
            char random = (char) rnd.nextInt(0, betuk3.length);
            betuk3[i] = random;
        }

        for (int i = 0; i < betuk3.length; i++) {
            if (i % 3 == 2) {
                System.out.printf("%s\n", betuk3[i]);
            } else {
                System.out.printf("%s ", betuk3[i]);
            }
        }
    }
}
