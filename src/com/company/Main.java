package com.company;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main
{

    public static void main(String[] args)
    {
        int n = 100000;
        System.out.print("Каждый метод вызывается по " + n + " раз \n");

        long time1, time2, time12;

        time1 = System.currentTimeMillis();

        ArrayList<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < n; j++)
                list1.add(((int)(Math.random() * 30) - 15));
        time2 = System.currentTimeMillis();
        time12 = time2 - time1;
        System.out.print("Метод add в ArrayList выполнялся " + (double)time12/1000 + " секунд\n");

        time1 = System.currentTimeMillis();

        LinkedList<Integer> list2 = new LinkedList<>();
        for (int j = 0; j < n; j++)
            list2.add(((int)(Math.random() * 30) - 15));
        time2 = System.currentTimeMillis();
        time12 = time2 - time1;
        System.out.print("Метод add в LinkedList выполнялся " + (double)time12/1000 + " секунд\n");

        time1 = System.currentTimeMillis();

        for (int j = 0; j < n; j++)
            list1.get(j);
        time2 = System.currentTimeMillis();
        time12 = time2 - time1;
        System.out.print("Метод get в ArrayList выполнялся " + (double)time12/1000 + " секунд\n");

        time1 = System.currentTimeMillis();

        for (int j = 0; j < n; j++)
            list2.get(j);
        time2 = System.currentTimeMillis();
        time12 = time2 - time1;
        System.out.print("Метод get в LinkedList выполнялся " + (double)time12/1000 + " секунд\n");

        time1 = System.currentTimeMillis();

        for (int j = n-1; j > 0; j--)
            list1.remove(j);
        time2 = System.currentTimeMillis();
        time12 = time2 - time1;
        System.out.print("Метод remove в ArrayList выполнялся " + (double)time12/1000 + " секунд\n");

        time1 = System.currentTimeMillis();

        for (int j = n-1; j > 0; j--)
            list2.remove(j);
        time2 = System.currentTimeMillis();
        time12 = time2 - time1;
        System.out.print("Метод remove в LinkedList выполнялся " + (double)time12/1000 + " секунд\n");
    }
}
