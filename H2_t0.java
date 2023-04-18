/*Task_0
public class Task_0 {

// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1” */
package Homework_S1;

import java.util.Scanner;

public class H2_t0 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Искомые элементы: ");
        String jewels = scan.nextLine();
        System.out.println("Исходная строка: ");
        String stones = scan.nextLine();
        System.out.println(findJewelsInStones(jewels, stones));
        scan.close();
    }
    
    public static String findJewelsInStones(String jewels, String stones){
        int[] sum = new int[jewels.length()];
        for (int index = 0; index < jewels.length(); index++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(index) == stones.charAt(j)) {
                    sum[index]++;
                }
            }
        }
        String res = "";
        for (int index = 0; index < jewels.length(); index++) {
            res = res + jewels.charAt(index) + sum[index];
        }
        return res;
    }
}
