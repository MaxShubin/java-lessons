package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 package com.company;

import java.util.Arrays;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                int size1;
                System.out.println("Введите количество элементов 1-ого массива");
                Scanner scanner1 = new Scanner(System.in);
                size1 = scanner1.nextInt();
                int[] arr1 = new int[size1];
                for (int i = 0; i < size1; i++) {
                    System.out.println("Введите элемент 1-ого массива");
                    Scanner scanner2 = new Scanner(System.in);
                    arr1[i] = scanner2.nextInt();
                }

                int size2;
                System.out.println("Введите количество элементов 2-ого массива");
                Scanner scanner3 = new Scanner(System.in);
                size2 = scanner3.nextInt();
                int[] arr2 = new int[size2];
                for (int i = 0; i < size2; i++) {
                    System.out.println("Введите элемент  2-ого массива");
                    Scanner scanner4 = new Scanner(System.in);
                    arr2[i] = scanner4.nextInt();
                }

                Arrays.sort(arr1);
                Arrays.sort(arr2);

                arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
                for (int i = arr2.length; i < arr1.length; i++) {
                    arr1[i] = arr2[i - arr2.length];
                }
                Arrays.sort(arr1);
                System.out.println("Новая последовательность" + Arrays.toString(arr1));
            }

        }
