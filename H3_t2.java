/*Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max() */
package Homework_S1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class H3_t2 {
    public static void main(String[] args) {
        List<Integer> numbers = createList(7, 1, 11);
        System.out.println(numbers);
        int a = Collections.max(numbers);
        int b = Collections.min(numbers);
        double c = average(numbers);
        System.out.printf("Максимум: %d, минимум: %d, среднее арифметическое: %f", a, b, c);
    }

    static List<Integer> createList(int capacity, int min, int max){
        List<Integer> result = new ArrayList<>(capacity);
        Random rnd = new Random();
        for (int i = 0; i < capacity; i++) {
            result.add(rnd.nextInt(min, max));
        }
        return result;
    }

    static double average(List<Integer> list){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return (double)(sum / list.size());
    }
}
