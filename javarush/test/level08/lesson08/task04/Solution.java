package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);

    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Polishchuk", new Date("JULY 12 1988"));
        map.put("Katsalap", new Date("AUGUST 12 1988"));
        map.put("Ivanov", new Date("MAY 18 1988"));
        map.put("Doser", new Date("DECEMBER 17 1990"));
        map.put("Roulf", new Date("MAY 8 1980"));
        map.put("Pibodi", new Date("JULY 26 1981"));
        map.put("Textman", new Date("DECEMBER 12 1982"));
        map.put("Javarush", new Date("SEPTEMBER 5 1988"));
        map.put("Robotnik", new Date("JUNE 11 1987"));
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashMap<String, Date> copy = new HashMap<String, Date>(map);
        for (Map.Entry<String, Date> pair: copy.entrySet())
        {
            int month = pair.getValue().getMonth();
            if(month > 4 && month < 8)
            {
                map.remove(pair.getKey());
            }
        }
    }
}