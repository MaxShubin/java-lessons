package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int n = 1;
        System.out.println("Введите количество элементов массива");
        Scanner scanner1 = new Scanner(System.in);
        size = scanner1.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i<size; i++){
            System.out.println("Введите " + (n++) + " элемент массива");
            Scanner scanner2 = new Scanner(System.in);
            arr[i] = scanner2.nextInt();
        }

        System.out.println("Введите число К");
        Scanner scanner3 = new Scanner(System.in);
        int k = scanner3.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print(Arrays.asList(arr[i]));
        }
        int sum = 0;
        for (int i = 0; i < size; i++){
            if (arr [i]%k == 0){
                sum = sum + arr[i];
            }
        }
        if (sum ==0){
            System.out.println("Нет эллементов кратных" +k);
        } else{
            System.out.println();
            System.out.println("Сумма элементов кратных " + k +"-ем " + "= " + sum);
        }
    }
}
