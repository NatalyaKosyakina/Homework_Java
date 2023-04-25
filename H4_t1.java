/*Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список. 
Постараться не обращаться к листу по индексам. */
package Homework_S1;

import java.util.LinkedList;
import java.util.ListIterator;

public class H4_t1 {
    public static void main(String[] args) {
        LinkedList<String> some_list = new LinkedList<>();
        some_list.add("1");
        some_list.add("2");
        some_list.add("3");
        some_list.add("4");
        System.out.println(some_list);

        System.out.println(turnList(some_list));
    }

    static LinkedList<String> turnList(LinkedList<String> list){
        LinkedList<String> result = new LinkedList<>();
        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            result.add(iterator.previous());
        }
        return result;
    }
}
