package com.example.myapplication;

public class ddd {
    public String id,name,Areal,Vid; //поля класса Plane

    //1. Создаем пустой конструктор (Правая кнопка мыши по области - Generate - Select None)
    public ddd() {
    }
    //2. Создаем заполненный конструктор, те поля, которые хотим добавить в базу данных
    //(Правая кнопка мыши по области - Generate - Выделяем все созданные поля в  public class Plane)
    public ddd(String id, String name, String Areal, String Vid) {
        this.id = id;
        this.name = name;
        this.Areal = Areal;
        this.Vid = Vid;
    }
}
