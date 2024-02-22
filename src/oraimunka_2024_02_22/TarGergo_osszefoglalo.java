package oraimunka_2024_02_22;

import java.util.Random;
import java.util.Scanner;

public class TarGergo_osszefoglalo {

    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in, "latin2");

    public static void main(String[] args) {
        System.out.println("1. feladat:");
        int szam = rnd.nextInt(3, 11);
        System.out.println(szam);
        System.out.print("2.feladat:");
        String tetszolegesBetu = sc.nextLine();
        System.out.printf("Tetszőleges betű: %s\n", tetszolegesBetu);
        System.out.println("3.feladat:");
        tetszolegesBetu = sc.nextLine();
        while (tetszolegesBetu.length() != 1) {
            System.out.println("Csak egy betű lehet !");
            tetszolegesBetu = sc.nextLine();
        }
        System.out.printf("Tetszőleges betű: %s\n", tetszolegesBetu);
        System.out.println("4.feladat:");
        for (int i = 0; i < szam; i++) {
            if (i == szam - 1) {
                System.out.printf("%s\n", tetszolegesBetu);
            } else {
                System.out.printf("%s,", tetszolegesBetu);
            }
        }
        System.out.println("5.feladat:");
        double[] valosSzamok = new double[5];
        valosSzamok[0] = Math.PI;
        valosSzamok[1] = Math.E;
        for (int i = 0; i < 2; i++) {
            System.out.printf("%.2f\n", valosSzamok[i]);
        }
        System.out.println("6.feladat:");
        valosSzamok[2] = (double) 1 / 3;
        for (int i = 0; i < valosSzamok.length; i++) {
            if (valosSzamok[i] > 0) {
                System.out.printf("%.2f\n", valosSzamok[i]);
            }
        }
        System.out.println("7.feladat:");
        valosSzamok[3] = rnd.nextDouble(10.11, 19.51);
        valosSzamok[4] = rnd.nextDouble(10.11, 19.51);
        for (int i = 0; i < valosSzamok.length; i++) {
            System.out.printf("%.1f ", valosSzamok[i]);
        }
        System.out.println("");
    }

}
