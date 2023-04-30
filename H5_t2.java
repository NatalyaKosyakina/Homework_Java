/*Пусть дан список сотрудников: 
Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. Для сортировки использовать TreeMap. */

package Homework_S1.Homework_S5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class H5_t2 {
    public static void main(String[] args) {
        // Ввод данных
        String line = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        String[] lines = line.split(", ");

        // Подсчет и сохранение количества повторов для каждого имени
        HashMap<String, Integer> repeats = new HashMap<String, Integer>();
        for (int i = 0; i < lines.length; i++) {
            String name = lines[i].split(" ")[0];
         if (repeats.containsKey(name)){
            repeats.put(name, (repeats.get(name) + 1));
         }
         else{
            repeats.put(name, 1);
         }
        }
        // Сортировка с помощью TreeMap
        TreeMap<Integer, List<String>> popularity = new TreeMap<>(Comparator.reverseOrder());
        for (Map.Entry<String, Integer> entry : repeats.entrySet()) {
            if (popularity.containsKey(entry.getValue())){
                List<String> list = popularity.get(entry.getValue());
                list.add(entry.getKey());
            }
            else {
                List<String> list = new ArrayList();
                list.add(entry.getKey());
                popularity.put(entry.getValue(), list);
            }
        }

        System.out.println(popularity);
    }
}
