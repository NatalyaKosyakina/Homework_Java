/*На первой строке записывается натуральное число n - количество строчек в книге. 
Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия.
Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия 
и продукт2 - продукт, на который следует заменить продукт1. 
Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. 
Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.

Выходные данные
Замените все продукты в поваренной книге Васи и выведите их построчно на экран. 
На окончания не обращайте внимание. ВАЖНО!!! Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
 */
package Homework_S1;

import java.util.Scanner;

public class H2_t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Количество строк в рецепте:   ");
        int N = Integer.parseInt(sc.nextLine());
        String[][] arr_n = new String[N][];
        for (int index = 0; index < N; index++) {
            arr_n[index] = sc.nextLine().split(" ");
        }
        System.out.println("Количество аллергенов:   ");
        int M = Integer.parseInt(sc.nextLine());
        String[][] arr_m = new String[M][];
        for (int index = 0; index < M; index++) {
            arr_m[index] = sc.nextLine().split(" - ");
        }
        sc.close();
        // Поиск по словам и замена
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < arr_n[i].length; k++) {
                for (int j = 0; j < M; j++) {
                    arr_n[i][k] = arr_n[i][k].replace(arr_m[j][0], arr_m[j][1]);
                    if (arr_n[i][k].strip().equalsIgnoreCase(arr_m[j][0])) {
                        //String turn_e = Character.toUpperCase(arr_m[j][1].charAt(0)) + arr_m[j][1].substring(1, arr_m[j][1].length() - 2);
                        arr_n[i][k] = Character.toUpperCase(arr_m[j][1].charAt(0)) + arr_m[j][1].substring(1, arr_m[j][1].length());
                    }
            }
            }
        }
        // Вывод результата
        PrintArray(arr_n);
    }

    public static void PrintArray(String[][] array){
        for (int index = 0; index < array.length; index++) {
            for (int j = 0; j < array[index].length; j++) {
                System.out.printf(array[index][j] + " ");            
            }
        }
    }
}
