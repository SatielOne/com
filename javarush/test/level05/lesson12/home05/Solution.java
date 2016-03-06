package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;
        int b = 0;
        String s = "";
        while (!s.equals(false))
        {
            s = reader.readLine();
            if (s.equals("сумма"))
                break;
            a = Integer.parseInt(s);
            b = a + b;
        }
        System.out.print(b);
    }
}
