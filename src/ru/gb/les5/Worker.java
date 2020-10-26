package ru.gb.les5;

import java.util.Scanner;

public class Worker
{
     String name;
     String position;
     String email;
     String phone;
     int salary;
     int age;

    public Worker(String name, String position, String email, String phone, int salary, int age)
    {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public void printInfo()
    {
        System.out.print("\n Имя : " + name);
        System.out.print("\n Должность : " + position);
        System.out.print("\n Электронная почта : " + email);
        System.out.print("\n Номер телефона : " + phone);
        System.out.print("\n Оклад : " + salary);
        System.out.print("\n Возраст : " + age);

    }
    void Show()
    {
        System.out.println(name + " " + position + " " + email + " " + phone + " " + salary + " " + age);
    }

}
