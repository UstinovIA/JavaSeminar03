package Seminar03.Homework;

//Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {4, 0, 10, 5, 5, 3, 9, 2, 6, 10};
        List<Integer> listNum = new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println(listNum.toString());
        deleteEvenNumbers(listNum);
        System.out.println(listNum.toString());
    }
    static void deleteEvenNumbers(List<Integer> list){
        for(int i = 0; i< list.size(); i++){
            if(list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }
    }
}
