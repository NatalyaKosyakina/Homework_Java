package Homework_S1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Ввод данных
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number_1 = scanner.nextDouble();
        System.out.println("Укажите действие: ");
        String doing = scanner.next();
        System.out.println("Введите число: ");
        double number_2 = scanner.nextDouble();
        scanner.close();

        // Выбор действия
        double res = 0;
        switch (doing) {
            case "+":
                res = number_1 + number_2;
                break;
            case "-":
                res = number_1 - number_2;
                break;
            case "*":
                res = number_1 * number_2;
                break;
            case "/":
                if (number_2 != 0) {
                    res = number_1 / number_2;
                } else {
                    System.out.println("Деление на 0 невозможно.");
                }
                break;
            default:
                System.out.println("Данные введены некорректно. Попробуйте ещё раз.");
                break;
        }
        // Вывод результата
        System.out.printf("%f %s %f = %f \n", number_1, doing, number_2, res);
    }
}
