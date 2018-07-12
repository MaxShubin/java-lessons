package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pos = 0;
        int h = 0;
        System.out.println("Введите высоту дерева(м)");
        h = scanner.nextInt() * 100;
        System.out.println("Введите положение улитки на дереве(см)");
        pos = scanner.nextInt();
        while (pos <= 0 || pos > h) {
            System.out.println("Улитка должна быть на дереве");
            pos = scanner.nextInt();
        }

        int[] arr = new int[30];
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            arr[i] = random.nextInt(2);
            if (arr[i] == 1) {
                pos += 2;
            } else {
                pos--;
            }
        }
        System.out.println("Через 30 дней улитка находится на высоте(см):" + pos);
    }
}
