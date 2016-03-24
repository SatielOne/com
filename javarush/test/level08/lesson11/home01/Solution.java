package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()){
            Cat cat = iterator.next();
            String s = cat.name;
            if (s.equals("Boris")){
                iterator.remove();
            }
        }
        printCats(cats);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> setOfCats = new HashSet<Cat>();
        setOfCats.add(new Cat("Mishka"));
        setOfCats.add(new Cat("Tilka"));
        setOfCats.add(new Cat("Boris"));
        return setOfCats;
    }

    public static void printCats(Set<Cat> cats)
    {
        for (Cat cat: cats)
        {
            System.out.println(cat);
        }
    }

    public static class Cat {
        String name;
        public Cat (String name){
            this.name = name;
        }
    }
}
