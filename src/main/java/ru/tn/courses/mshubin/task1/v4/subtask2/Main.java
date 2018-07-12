package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        boolean flag = false;
        System.out.println("Введите количество элементов массива:");
        size = scanner.nextInt();
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(1000);
        }

        Arrays.sort(arr);
        System.out.println("Исходный массив: \n" + Arrays.toString(arr));
        System.out.println("Элементы, которые являются степенью двойки: \n");
        for (int i = 0; i < size; i++) {
            if ((int) (Math.log(arr[i]) / Math.log(2)) == (Math.log(arr[i]) / Math.log(2))) {
                flag = true;
                System.out.print(arr[i] + " ");
            }
        }
    }
}