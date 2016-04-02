package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFather1 = new Human("Иннокентий",true,70, new ArrayList<Human>());
        Human grandFather2 = new Human("Василий",true,68,new ArrayList<Human>());
        Human grandMother1 = new Human("Марфа",false,65, new ArrayList<Human>());
        Human grandMother2 = new Human("Груня",false,63, new ArrayList<Human>());
        Human father = new Human("Олег",true,40,new ArrayList<Human>());
        Human mother = new Human("Нина",false,35,new ArrayList<Human>());
        Human children1 = new Human("Саша",false,15,new ArrayList<Human>());
        Human children2 = new Human("Дима",true,14,new ArrayList<Human>());
        Human children3 = new Human("Оксана",false,13,new ArrayList<Human>());
        grandFather1.children.add(father);
        grandFather2.children.add(mother);
        grandMother1.children.add(father);
        grandMother2.children.add(mother);
        father.children.add(children1);
        father.children.add(children2);
        father.children.add(children3);
        mother.children.add(children1);
        mother.children.add(children2);
        mother.children.add(children3);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(children1);
        System.out.println(children2);
        System.out.println(children3);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, List<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
