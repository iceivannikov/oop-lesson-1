package com.ivannikov.oop.lesson20.task3;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CinemaExample {
    public static void main(String[] args) {
        Cinema cinema = getCinema();

        delimiter();
        List<Film> filmByYear = cinema.getAllFilmsByYear(1985);
        filmByYear.forEach(System.out::println);
        delimiter();
        List<Film> allFilmsByYear = cinema.getAllFilmsByYearAndMonth(1985, 2);
        allFilmsByYear.forEach(System.out::println);
        delimiter();
        List<Film> allFilmsByGenre = cinema.getAllFilmsByGenre("drama");
        allFilmsByGenre.forEach(System.out::println);
        delimiter();
        List<Film> topTenFilmsInDescendingOrder = cinema.getTopTenFilmsInDescendingOrder();
        topTenFilmsInDescendingOrder.forEach(System.out::println);
        delimiter();
        cinema.print();
        delimiter();
    }

    private static void delimiter() {
        System.out.println("-".repeat(100));
    }

    private static Cinema getCinema() {
        Film film1 = new Film(1, 1985, 12, "drama", 6.7);
        Film film2 = new Film(2, 1965, 1, "comedy", 8.7);
        Film film3 = new Film(78, 1985, 12, "fantastic", 4.8);
        Film film4 = new Film(90, 1985, 2, "drama", 4.0);
        Film film5 = new Film(3, 1985, 2, "comedy", 4.7);
        Film film6 = new Film(10, 1995, 8, "fantastic", 6.3);
        Film film7 = new Film(34, 1990, 5, "drama", 8.9);
        Film film8 = new Film(34, 1988, 5, "comedy", 4.5);
        Film film9 = new Film(34, 1986, 5, "drama", 5.0);
        Film film10 = new Film(34, 1989, 5, "comedy", 7.5);
        Film film11 = new Film(34, 1968, 5, "fantastic", 4.3);
        Film film12 = new Film(34, 1978, 5, "drama", 9.9);

        Map<Integer, List<Film>> films = new TreeMap<>();
        Cinema cinema = new Cinema(films);
        cinema.addFilm(film1);
        cinema.addFilm(film3);
        cinema.addFilm(film2);
        cinema.addFilm(film4);
        cinema.addFilm(film5);
        cinema.addFilm(film6);
        cinema.addFilm(film7);
        cinema.addFilm(film8);
        cinema.addFilm(film9);
        cinema.addFilm(film10);
        cinema.addFilm(film11);
        cinema.addFilm(film12);
        return cinema;
    }
}
