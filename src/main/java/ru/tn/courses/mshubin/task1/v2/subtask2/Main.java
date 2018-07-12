package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество банков");
        int n = scanner.nextInt();
        Bank[] banks = new Bank[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            banks[i] = new Bank("bank" + (i + 1), (int) (random.nextFloat() * 10 + (random.nextInt(80))));
            System.out.println(banks[i]);
        }
        Arrays.sort(banks, Bank.IIIOPA);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(banks[i]);
        }
        System.out.println("Самый(е) выгодный(е) банк(и) для обмена долларов на рубли:");
        for (int i = n; i > 0 ; i--) {
            if (banks[n-1].getCourse() == (banks[i-1].getCourse())){
                System.out.println(banks[i-1].getName());
            }
        }
    }
}

