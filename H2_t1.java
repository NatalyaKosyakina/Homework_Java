/*// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc” */
package Homework_S1;

import java.util.Scanner;

public class H2_t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:   ");
        String S = sc.nextLine();
        System.out.println("Введите порядок символов через пробел:   ");
        String[] input_index = sc.nextLine().split(" ");
        int[] indexes = new int[input_index.length];
        for (int i = 0; i < indexes.length; i++) {
            indexes[i] = Integer.parseInt(input_index[i]);
        }
        System.out.println(shuffle(S, indexes));
        sc.close(); 
    }

    public static String shuffle(final String s, final int[] index){
        String string = "";
       try {
        for (int i = 0; i < index.length; i++) {
            string = string + s.charAt(index[i] - 1);
        }
       } catch (Exception e) {
        string = "Набор индексов не подходит к размеру этой строки";
       }
       return string;
    }
}
