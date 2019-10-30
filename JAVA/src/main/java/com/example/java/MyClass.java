package com.example.java;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String in = scanner.nextLine();
            for (int i = 0; i < in.length(); i++) {
                switch (Integer.parseInt(String.valueOf(in.charAt(i)))) {
                    case 0:
                        System.out.print("零");
                }

            }
        }
    }
}
