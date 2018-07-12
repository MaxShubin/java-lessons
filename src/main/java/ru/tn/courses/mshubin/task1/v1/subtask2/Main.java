package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int time;
        System.out.println("Введите количество покупателей");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        System.out.println("За сколько минут обслуживают одного покупателя:");
        time = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }

        System.out.println("Введите номер покупателя в очереди");
        int numberOfClient = scanner.nextInt();
        time = (numberOfClient - 1) * time;
        while ((time - 60) >= 0) {
            time = time - 60;
        }

        if (numberOfClient == 1) {
            System.out.println("Первый человек в очереди уже обслуживается");
        } else {
            System.out.println("Время ожидания покупателя под номером " + numberOfClient + " равно " + time + " минут");
        }
    }
}