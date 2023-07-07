package Seminar03.Homework;

//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке. Collections.frequency(list, item)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        List<String> listPlanets = new ArrayList<>();
        listPlanets.add("Меркурий");
        listPlanets.add("Земля");
        listPlanets.add("Уран");
        listPlanets.add("Земля");
        listPlanets.add("Марс");
        listPlanets.add("Нептун");
        listPlanets.add("Сатурн");
        listPlanets.add("Венера");
        listPlanets.add("Земля");
        listPlanets.add("Нептун");
        countRepeat(listPlanets);
    }

    static void countRepeat(List<String> list){
        List<String> temp = new ArrayList<>();
        for(int i=0; i < list.size(); i++){
            if(Collections.frequency(temp, list.get(i)) == 0){
                System.out.println(
                        list.get(i) + " повторяется " + Collections.frequency(list, list.get(i)) + " раз(а)");
                temp.add(list.get(i));
            }
        }
    }
}
