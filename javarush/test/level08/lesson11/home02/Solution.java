package com.javarush.test.level08.lesson11.home02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        HashSet<Cat> result = new HashSet<Cat>();

        result.add(new Cat("Boris"));
        result.add(new Cat("Mishka"));
        result.add(new Cat("Murzik"));
        result.add(new Cat("Barsik"));

        return result;
    }

    public static Set<Dog> createDogs()
    {
        HashSet<Dog> result = new HashSet<Dog>();

        result.add(new Dog("Bolto"));
        result.add(new Dog("Sharick"));
        result.add(new Dog("Rex"));

        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        HashSet<Object> join = new HashSet<Object>();
        join.addAll(cats);
        join.addAll(dogs);
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        pets.removeAll(cats);
        /*Iterator<Object> iterator = pets.iterator();
        while(iterator.hasNext()){
            Object pet = iterator.next();
            if (pet.equals(cats))
            {
                iterator.remove();
            }
        }*/
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object pet: pets)
        {
            System.out.println(pet);
        }
    }

    public static class Cat {
    String name;
        public Cat (String name) {
            this.name = name;
        }
    }
    public static class Dog {
        String name;
        public Dog (String name) {
            this.name = name;
        }
    }
}
