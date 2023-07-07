package Seminar03.Homework;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {0, 4, 3, 0, 4, 3, 8, 10, 0, 5};
        List<Integer> listNum = new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println("Минимальное число в списке: " + Collections.min(listNum));
        System.out.println("Максимальное число в списке: " + Collections.max(listNum));
        System.out.println("Среднее арифметическое чисел списка: " + avgList(listNum));
    }
    static double avgList(List<Integer> list){
        double result = 0;
        for(int i=0; i < list.size(); i++){
            result += list.get(i);
        }
        return result / list.size();
    }
}
