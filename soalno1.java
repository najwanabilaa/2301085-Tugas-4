package com.oopjava.perulangan;

import java.util.Scanner;

public class soalno1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}

