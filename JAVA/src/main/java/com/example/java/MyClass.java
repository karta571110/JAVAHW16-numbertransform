package com.example.java;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("�п�J���ԧB�Ʀr�H���ഫ:");
            String in = scanner.nextLine();
            for (int i = 0; i < in.length(); i++) {
                switch (Integer.parseInt(String.valueOf(in.charAt(i)))) {
                    case 0:
                        System.out.print("�s");
                    case 1:
                        System.out.print("��");
                    case 2:
                        System.out.print("�L");
                    case 3:
                        System.out.print("��");
                    case 4:
                        System.out.print("�v");
                    case 5:
                        System.out.print("��");
                    case 6:
                        System.out.print("��");
                    case 7:
                        System.out.print("�m");
                    case 8:
                        System.out.print("��");
                    case 9:
                        System.out.print("�h");
                }

            }
        }
    }
}
