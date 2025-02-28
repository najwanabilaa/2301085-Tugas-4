package com.oopjava.perulangan;

import java.util.Scanner;

public class soalno2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1, s2, s3;
        boolean valid = false;

        while (!valid) {
            System.out.print("Masukkan sisi ke-1: ");
            s1 = scanner.nextInt();
            System.out.print("Masukkan sisi ke-2: ");
            s2 = scanner.nextInt();
            System.out.print("Masukkan sisi ke-3: ");
            s3 = scanner.nextInt();

            if (s1 > 0 && s2 > 0 && s3 > 0) {
                valid = true;
                if (s1 == s2 && s2 == s3) {
                    System.out.println("Yap, Ini Termasuk Kubus");
                } else {
                    System.out.println("Yah, Ini Bukan Kubus");
                }
            } else {
                System.out.println("Coba masukkan angka yang valid ya yang lebih dari 0!");
            }
        }
    }   
}

