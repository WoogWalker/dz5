package com.car.parts;

public class Main {

    public static void main(String[] args) {
        System.out.println("123");
//        CarDoor d1 = new CarDoor(true, true);
//        d1.show();
    }
}




/*
* Создать пакет соответствующий(название на ваш вкус, но должно быть логично связано с именами классов) пакет
и поместить туда все последующие классы
Класс CarDoor
На прямую к переменным этого класса никто не может, только через методы
Хранит
состояние двери(открыта/закрыта)
состояние окна (открыто/закрыто)
Конструктор
Один без аргументов. Он должен присвоить переменным значения на случай если данных нет.
Один конструктор принимает оба состояния, двери и окна. Присваивает эти значения переменным внутри объекта.
Методы
открыть дверь
закрыть дверь
открыть/закрыть дверь (если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
открыть окно
закрыть окно
открыть/закрыть окно(если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
Вывести в консоль данные об объекте
Класс CarWheel
На прямую к переменным этого класса никто не может, только через методы
Хранит
Состояние целостности шины (дробное число от 0-стерта до 1-новая)
Конструктор
Аналогичный принцип как в классе CarDoor
Методы
Сменить шину на новую
Стереть шину на X%
Получить состояние (return)
Вывести в консоль данные об объекте
Класс Car
На прямую к переменным этого класса никто не может, только через методы
Хранит
дата производства (неизменна после создания объекта)
тип двигателя
максимальная скорость машины (если она новая)
время разгона до 100км/ч
пассажировместимость
кол-во пассажиров внутри в данный момент
текущая скорость
массив колес
массив дверей
Конструктор
Нет пустого конструктора. Так как есть поля в классе, которые нельзя изменять после создания объекта. Например дата производства.
Конструктор с датой производства.
Конструктор со всеми полями, кроме массива колес и массива дверей.
Методы
Изменить текущую скорость
Посадить 1 пассажира в машину
Высадить 1 пассажира
Высадить всех пассажиров
Получить дверь по индексу
Получить колесо по индексу
Снять все колеса с машины
Установить на машину X новых колесу (вдобавок к имеющимся, то есть если было 4 колеса, после вызова метода с Х аргументом равным трем, колес будет 4+3=7)
Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так. Максимальная скорость новой машины множиться на самое стертое колесо в машине. Максимальная скорость равна 0 если в машине нет ни одного пассажира, так как некому ее вести)
Вывести в консоль данные об объекте (все поля и вычисленную максимальную скорость в зависимости от целостности колес и наличия водителя)
* */