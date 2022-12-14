package jv.Seminar3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class task {
    // Пусть дан произвольный список целых чисел    
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
           
        System.out.println("List: " + list);
        //Получаем максимальное значение из списка
        System.out.println("Максимум: " + getMax(list));
        //Получаем минимальное значение из списка
        System.out.println("Минимум: " + getMin(list));
        //Получаем среднее арифметическое
        System.out.println("Среднее значение: " + getAverage(list));
        //Удаляем чётные числа
        System.out.println("Удаление четных чисел: " + removeNegativeValue(list));              
    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeNegativeValue(List<Integer> list){        
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()){
            if (iter.next() % 2 == 0) iter.remove();
        } 
        return list;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){

        return Collections.min(list);
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){

        return Collections.max(list);
    }

    // Найти среднее значение
    public static Integer getAverage(List<Integer> list){

        int sum = 0;

        for (int num: list) {
            sum = num + sum;
        }

        return ((int) sum/list.size());
    }
}
