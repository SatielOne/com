package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] stroka = new String[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            stroka[i] = s.substring(i,i+1);
        }
        for (int k = 0; k < stroka.length; k++)
        {
            if (stroka[k].equals(" "))
            {
                stroka[k+1] = stroka[k+1].toUpperCase();
            }
        }

        for (int j = 0; j < stroka.length; j++)
        {
            System.out.print(stroka[j]);
        }

    }


}
