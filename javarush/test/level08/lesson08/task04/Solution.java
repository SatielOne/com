package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Kidman", new Date("DECEMBER 1 1980"));
        map.put("Depp", new Date("NOVEMBER 1 1980"));
        map.put("Schwarz", new Date("NOVEMBER 1 1980"));
        map.put("Kunis", new Date("NOVEMBER 1 1980"));
        map.put("Rembrant", new Date("NOVEMBER 1 1980"));
        map.put("Wait", new Date("NOVEMBER 1 1980"));
        map.put("Black", new Date("NOVEMBER 1 1980"));
        map.put("Johnson", new Date("NOVEMBER 1 1980"));
        map.put("Kennedi", new Date("JUNE 1 1980"));

        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код

    }
}
