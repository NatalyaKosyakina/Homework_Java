package Homework_S1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int[] even_i = new int[n / 2 + n % 2];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            if (i % 2 == 0) {
                sum += numbers[i];
                even_i[count] = numbers[i];
                count++;
            }
        }
        scanner.close();
        System.out.println();
        System.out.println(sum);
        PrintArray(even_i);
    }

    public static void PrintArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }
}
