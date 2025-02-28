package com.oopjava.perulangan;

import java.util.Scanner;

public class soalno3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        boolean valid;

        do {
            valid = true;
            System.out.print("Yuk Masukkan sisi ke-1: ");
            a = scanner.nextInt();
            System.out.print("Yuk Masukkan sisi ke-2: ");
            b = scanner.nextInt();
            System.out.print("Yuk Masukkan sisi ke-3: ");
            c = scanner.nextInt();

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Sisi harus lebih dari 0! Try Again!");
                valid = false;
            }
        } while (!valid);

        if (a * a + b * b == c * c) {
            System.out.println("Ini Segitiga Siku-siku");
        } else if (a * a + b * b > c * c) {
            System.out.println("Ini Segitiga Lancip");
        } else {
            System.out.println("Ini Segitiga Tumpul");
        }
    }
}


