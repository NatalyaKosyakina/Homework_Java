/*Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
Вывести название каждой планеты и количество его повторений в списке. */
package Homework_S1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class H3_t3 {
    public static void main(String[] args) {
        // Заполнение списка в произвольном порядке с повторениями
        String[] planets_m = { "Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун" };
        List<String> planets_l = new ArrayList<>();
        Random rnd = new Random();
        for (int index = 0; index < (planets_m.length + 4); index++) {
            planets_l.add(planets_m[rnd.nextInt(0, planets_m.length)]);
        }
        Collections.shuffle(planets_l);
        System.out.println(planets_l);

        // Подсчет элементов и вывод на экран
        int count = 0;
        for (int i = 0; i < planets_m.length; i++) {
            for (int j = 0; j < planets_l.size(); j++) {
                if (planets_m[i] == planets_l.get(j)){
                    count++;
                }
            }
            System.out.printf("%s : %d \n", planets_m[i], count);
            count = 0;
        }
    }
}
