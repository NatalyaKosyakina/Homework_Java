package Homework_S1;
import java.util.Scanner;

public class Tasks1 {
    public static void main(String[] args) {
        // Выбор действия:
        System.out.println("Выберите действие, указав номер задачи: ");
        Scanner scanner = new Scanner(System.in);
        int doing = scanner.nextInt();
        if (doing == 1) {
            System.out.println("Укажите номер треугольного числа: ");
            int number1 = scanner.nextInt();
            System.out.println(TriangleNumber(number1));
        }
        else if (doing == 2) {
            System.out.println("Укажите номер факториала: ");
            int number1 = scanner.nextInt();
            System.out.println(FactorialN(number1));
        }
        else if (doing == 3) {
            System.out.println(FactorialN(1000));
        }
        else {System.out.println("Неправильно указан номер.");}
        scanner.close();
    }

    // 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n).
    public static int TriangleNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++)
            sum += i;
        return sum;
    }

    // 2. Вычислить n! (произведение чисел от 1 до n).
    public static int FactorialN(int number) {
        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // 3. Вывести все простые числа от 1 до 1000.
    public static void PrimeNumbers(int number) {
        for (int i = 3; i <= number - 3; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.printf("%d, ", i);
            }
        }
    }

}
