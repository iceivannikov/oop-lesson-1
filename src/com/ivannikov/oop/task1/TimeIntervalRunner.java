package com.ivannikov.oop.task1;

/*
Создать класс, описывающий промежуток времени.
   Сам промежуток времени должен задаваться тремя свойствами:
   секундами, минутами и часами.
   Создать метод для получения полного количества секунд в объекте
   Создать два конструктора: первый принимает общее количество
   секунд, второй - часы, минуты и секунды по отдельности.
   Создать метод для вывода данных.
 */
public class TimeIntervalRunner {
    public static void main(String[] args) {
        TimeInterval interval = new TimeInterval(30, 2, 1);
        TimeInterval intervalSec = new TimeInterval(interval.totalSeconds());
//        System.out.println(interval.totalSeconds());
//        System.out.println(intervalSec.totalSeconds());
//        intervalSec.print();

        TimeInterval sum = interval.sum(intervalSec);
        sum.print();
    }
}
