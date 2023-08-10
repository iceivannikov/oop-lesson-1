package com.ivannikov.oop.lesson20.task3;

public class Film {
    private Integer id;
    private Integer publishingYear;
    private Integer publicationMonth;
    private String genre;
    private Double rating;

    public Film(Integer id, Integer publishingYear, Integer publicationMonth, String genre, Double rating) {
        this.id = id;
        this.publishingYear = publishingYear;
        this.publicationMonth = publicationMonth;
        this.genre = genre;
        this.rating = rating;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(Integer publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Integer getPublicationMonth() {
        return publicationMonth;
    }

    public void setPublicationMonth(Integer publicationMonth) {
        this.publicationMonth = publicationMonth;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", publishingYear=" + publishingYear +
                ", publicationMonth=" + publicationMonth +
                ", genre='" + genre + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}
