/*Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. 
Используйте итератор */
package Homework_S1;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class H4_t3 {
    public static void main(String[] args) {
        System.out.println("Укажите размер списка: ");
        Scanner scan = new Scanner(System.in);
        int list_size = scan.nextInt();
        LinkedList<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < list_size; i++) {
            list1.add(scan.nextInt());
        }
        System.out.println(list1);
        ListIterator<Integer> iterator = list1.listIterator(0);
        int result = 0;
        while (iterator.hasNext()) {
            result += iterator.next();
        }
        System.out.println(result);
        scan.close();
    }
}
