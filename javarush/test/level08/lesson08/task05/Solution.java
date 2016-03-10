package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Ivanov","Ivan");
        map.put("Petrov","Petr");
        map.put("Sidorov","Sidr");
        map.put("Titov","Sly");
        map.put("Prohorov","Ivan");
        map.put("Osadchev","Nikita");
        map.put("Bogin","Ilya");
        map.put("Korostelev","Dima");
        map.put("Supov","Alex");
        map.put("Johnson","Ivan");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();

            HashMap<String, String> copy = new HashMap<String, String>(map);
            for (Map.Entry<String, String> pairp: copy.entrySet())
            {
                if (pairp.getValue().equals(value))
                    map.remove(pairp.getKey());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        //removeItemFromMapByValue(map,"Ivan");
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }
}
