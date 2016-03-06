package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name;
    int weight;
    int age;
    String color;
    String address;

    public void initialize (String name)
    {
        this.name = name;
        int weight = 2;
        int age = 2;
        String address = null;
    }

    public void initialize (String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        String address = null;
    }

    public void initialize (String name, int age)
    {
        this.name = name;
        this.weight = 2;
        this.age = age;
        String address = null;
    }

    public void initialize (int weight, String color)
    {
        this.color = color;
        this.weight = weight;
        int age = 2;
        String address = null;
        this.name = null;
    }

    public void initialize (String color, int weight, String address)
    {
        this.color = color;
        this.weight = weight;
        this.address = address;
        int age = 2;
        this.name = null;
    }

}
