package com.example.java;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("請輸入阿拉伯數字以供轉換:");
            String in = scanner.nextLine();
            for (int i = 0; i < in.length(); i++) {
                switch (Integer.parseInt(String.valueOf(in.charAt(i)))) {
                    case 0:
                        System.out.print("零");
                    case 1:
                        System.out.print("壹");
                    case 2:
                        System.out.print("貳");
                    case 3:
                        System.out.print("參");
                    case 4:
                        System.out.print("肆");
                    case 5:
                        System.out.print("伍");
                    case 6:
                        System.out.print("陸");
                    case 7:
                        System.out.print("柒");
                    case 8:
                        System.out.print("捌");
                    case 9:
                        System.out.print("玖");
                }

            }
        }
    }
}
