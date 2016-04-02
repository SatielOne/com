package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Иванов","Саша");
        map.put("Титов","Витя");
        map.put("Сидоров","Митя");
        map.put("Крикунов","Дима");
        map.put("Петров","Миша");
        map.put("Соболев","Толя");
        map.put("Ишкачев","Дима");
        map.put("Хмелевских","Никита");
        map.put("Исаичев","Саша");
        map.put("Кострицикий","Борис");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Map<String, String> map2 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair2 : map2.entrySet())
        {
            String value = pair2.getValue();
            int count = 0;
            for (Map.Entry<String, String> pair : map.entrySet())
            {
                if (pair.getValue().equals(value))
                    count++;
            }
            if (count > 1)
                removeItemFromMapByValue(map,value);
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
}
