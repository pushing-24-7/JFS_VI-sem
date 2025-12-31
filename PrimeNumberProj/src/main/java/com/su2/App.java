package com.su2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) {
                return;
            }
            int s = sc.nextInt();
            if (!sc.hasNextInt()) {
                return;
            }
            int e = sc.nextInt();
            if (e < 2 || s > e) {
                return;
            }

            boolean[] arr = new boolean[e + 1];
            for (int i = 0; i <= e; i++) {
                arr[i] = true;
            }
            arr[0] = false;
            if (e >= 1) arr[1] = false;

            for (int i = 2; i * i <= e; i++) {
                if (arr[i]) {
                    for (int j = i * i; j <= e; j += i) {
                        arr[j] = false;
                    }
                }
            }

            for (int i = Math.max(2, s); i <= e; i++) {
                if (arr[i]) {
                    System.out.println(i);
                }
            }
        }
    }
}