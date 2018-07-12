package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество покупателей");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("За сколько минут обслуживают одного покупателя:");
        int tj = scanner.nextInt();

        int [] a = new int [n];
        for (int i = 0; i < n; i++){
            a[i] = i + 1;
        }

        System.out.println("Введите номер покупателя в очереди");
        int numberofclient = scanner.nextInt();
        tj = (numberofclient - 1) * tj;

        while ((tj - 60) >= 0) {
            tj = tj - 60;
        }

        if (numberofclient == 1) {
            System.out.println("Первый человек в очереди уже обслуживается");
        } else {
            System.out.println("Время ожидания покупателя под номером " + numberofclient + " равно "  + tj + " минут");
        }
    }
}
