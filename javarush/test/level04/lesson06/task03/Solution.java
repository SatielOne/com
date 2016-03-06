package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int m1, m2, m3;

        if ((a>b)&&(a>c))
            m3 = a;
        else if ((b>c)&&(b>a))
            m3 = b;
        else m3 = c;

        if ((a<b)&&(a<c))
            m1 = a;
        else if ((b<c)&&(b<a))
            m1 = b;
        else m1 = c;

        if ((a>b)&&(c>a))
            m2 = a;
        else if ((a>c)&&(b>a))
            m2 = a;
        else if ((b>a)&&(c>b))
            m2 = b;
        else if ((b>c)&&(a>b))
            m2 = b;
        else m2 = c;

        System.out.println(m3 + " " + m2 + " " + m1);

    }
}
