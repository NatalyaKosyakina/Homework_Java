
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*Реализуйте очередь с помощью LinkedList со следующими методами: 
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя. */
// package Homework_S1;

public class H4_t2 {
        public static void main(String[] args) {
        H4_t2 list_1 = new H4_t2();
        list_1.enqueue("1");
        list_1.enqueue("2");
        list_1.enqueue("3");
        list_1.enqueue("4");

        System.out.println(list_1.dequeue());
        System.out.println(list_1.first());
    }

    private String[] arr = new String[10];
    private int size = 0;

    void enqueue(String new_element){
        if(size == arr.length){
            String[] arr2 = new String[arr.length + 10];
            System.arraycopy(arr, 0, arr2, 0, arr2.length);
            arr = arr2;
        }
        arr[size++] = new_element;
    }
    String dequeue(){
        String result = arr[0];
        String[] arr2 = new String[arr.length - 1];
        System.arraycopy(arr, 1, arr2, 0, arr2.length);
        arr = arr2;
        return result;
    }
    String first(){
        return arr[0];
    }
}
