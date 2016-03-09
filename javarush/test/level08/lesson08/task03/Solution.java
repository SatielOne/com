package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов","Костя");
        map.put("Петров","Никита");
        map.put("Сидоров","Николай");
        map.put("Порошин","Вадим");
        map.put("Кунис","Мила");
        map.put("Депп","Джонни");
        map.put("Питт","Бред");
        map.put("Райдер","Вайнона");
        map.put("Ривз","Киану");
        map.put("Нортон","Эдвард");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int i = 0 ;
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            String value = pair.getValue();
            if (value.equals(name))
            {
                i++;
            }
        }
        return i;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int j = 0 ;
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            String key = pair.getKey();
            if (key.equals(lastName))
            {
                j++;
            }
        }
        return j;

    }

    public static void main(String[] args)
    {
        createMap();
        System.out.println(getCountTheSameFirstName(createMap(), "Николай"));
        System.out.println(getCountTheSameLastName(createMap(), "Депп"));
    }
}
