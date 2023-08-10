package com.ivannikov.oop.lesson20.task3;

import java.util.*;

public class Cinema {
    private Map<Integer, List<Film>> films;

    public Cinema(Map<Integer, List<Film>> films) {
        this.films = films;
    }

    public void addFilm(Film film) {
        if (films.isEmpty()) {
            List<Film> list = new ArrayList<>();
            list.add(film);
            films.put(film.getPublishingYear(), list);
        } else {
            List<Film> list;
            if (films.containsKey(film.getPublishingYear())) {
                list = films.get(film.getPublishingYear());
            } else {
                list = new ArrayList<>();
            }
            list.add(film);
            films.put(film.getPublishingYear(), list);
        }
    }

    public List<Film> getAllFilmsByYear(Integer year) {
        List<Film> result = films.get(year);
        result.sort(Comparator.comparing(Film::getPublishingYear));
        return result;
    }

    public List<Film> getAllFilmsByYearAndMonth(Integer year, Integer month) {
        List<Film> filmByYeas = films.get(year);
        List<Film> result = new ArrayList<>();
        for (Film film : filmByYeas) {
            if (film.getPublicationMonth().equals(month)) {
                result.add(film);
            }
        }
        return result;
    }

    public List<Film> getTopTenFilmsInDescendingOrder(){
        List<Film> result = new ArrayList<>(10);
        int rating = 0;
        for (List<Film> list : films.values()) {
            for (Film film : list) {
                if (film.getRating() > rating && result.size() < 10) {
                    result.add(film);
                }
            }
        }
        result.sort(Comparator.comparing(Film::getRating).reversed());
        return result;
    }

    public List<Film> getAllFilmsByGenre(String genre) {
        List<Film> result = new ArrayList<>();
        for (List<Film> list : films.values()) {
            for (Film film : list) {
                if (film.getGenre().equals(genre)) {
                    result.add(film);
                }
            }
        }
        return result;
    }


    public void print() {
        for (Map.Entry<Integer, List<Film>> entry : films.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    public Map<Integer, List<Film>> getFilms() {
        return films;
    }

    public void setFilms(Map<Integer, List<Film>> films) {
        this.films = films;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "films=" + films +
                '}';
    }
}
