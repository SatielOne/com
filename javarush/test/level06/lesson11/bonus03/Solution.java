package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++)
        {
            int a = Integer.parseInt(reader.readLine());
            list.add(a);
        }

        for (int j = 0; j < 5; j++)
        {
            while (list.get(4) < list.get(3))
            {
                int e = list.get(4);
                list.remove(4);
                list.add(3, e);
            }

            while (list.get(3) < list.get(2))
            {
                int d = list.get(3);
                list.remove(3);
                list.add(2, d);
            }

            while (list.get(2) < list.get(1))
            {
                int c = list.get(2);
                list.remove(2);
                list.add(1, c);
            }

            while (list.get(1) < list.get(0))
            {
                int b = list.get(1);
                list.remove(1);
                list.add(0, b);
            }
        }
        for (int k = 0; k < 5; k++)
        {
            System.out.println(list.get(k));
        }
    }
}
