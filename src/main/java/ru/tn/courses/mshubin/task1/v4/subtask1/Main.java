package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        boolean flag = false;
        System.out.println("Введите количество элементов массива:");
        size = scanner.nextInt();
        if (size == 1) {
            System.out.println("Массив не является последовательностью чисел, т.к. состоит из одного элемента");
            System.exit(0);
        }

        int[] arr = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Исходный массив: \n" + Arrays.toString(arr));
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Массив возрастающий");
        } else {
            System.out.println("Массив не является возрастающим");
        }
    }
}