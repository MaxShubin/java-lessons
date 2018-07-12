package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {

        System.out.println("Введите количество элементов массива: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int kolEl = Integer.parseInt(reader.readLine());
        int arr[] = new int[kolEl];
        if (kolEl > 0) {
            System.out.println("Введите элементы массива: ");
            for (int i = 0; i < kolEl; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            int arrNol[] = createArray(arr, kolEl);
        } else {
            System.out.println("Количество элементов меньше 0");
        }

    }

    public static int[] createArray(int arr[], int kolEl) {

        int kol = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                kol++;
        }
        if (kol > 0) {
            int arrNol[] = new int[kol];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arrNol[index] = i;
                    index++;
                }
            }
            System.out.print("Массив номеров нулевых элементов: ");
            for (int i = 0; i < arrNol.length; i++) {
                if (i == arrNol.length - 1)
                    System.out.print(arrNol[i]);
                else
                    System.out.print(arrNol[i] + " ");
            }

            return arrNol;
        } else {
            System.out.println("В массиве нет элементов равных 0");
            return null;
        }

    }
}