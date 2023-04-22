/*Дан произвольный список целых чисел, удалить из него чётные числа */
package Homework_S1;

import java.util.ArrayList;
import java.util.List;

public class H3_t1 {
    public static void main(String[] args) {
        List some_list = new ArrayList();
        some_list.add(123);
        some_list.add("hi");
        some_list.add(56);
        some_list.add(12);
        some_list.add("123");
        some_list.add("some");
        some_list.add(22);
        some_list.add(null);
        System.out.println(some_list);
        removeEvenNumbers(some_list);
        System.out.println(some_list);
    }

    static void removeEvenNumbers(List list){
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) instanceof Number) && ((int)(list.get(i)) % 2 == 0)){
                list.remove(i);
                i--;
            }
        }
    }
    
}
