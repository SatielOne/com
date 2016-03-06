package com.javarush.test.level04.lesson07.task01;

/* Строка - описание
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
«отрицательное четное число» - если число отрицательное и четное,
«отрицательное нечетное число» - если число отрицательное и нечетное,
«нулевое число» - если число равно 0,
«положительное четное число» - если число положительное и четное,
«положительное нечетное число» - если число положительное и нечетное.
Пример для числа 100:
положительное четное число
Пример для числа -51:
отрицательное нечетное число
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        String z1;
        if (a > 0)
        z1 = "положительное ";
        else if (a < 0)
            z1 = "отрицательное ";
        else z1 = "";

        String z2;
        if ((a%2 == 0)&&(a != 0))
            z2 = "четное число";
        else if (a == 0)
            z2 = "нулевое число";
        else z2 = "нечетное число";

        System.out.print(z1 + z2);

    }
}
