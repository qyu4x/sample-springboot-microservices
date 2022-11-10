package com.neko.movieratingservice.model.response;

public class MovieRatingResponse {

    private String idMovie;

    private String idUser;

    private Double rating;

    public MovieRatingResponse() {
    }

    public MovieRatingResponse(String idMovie, String idUser, Double rating) {
        this.idMovie = idMovie;
        this.idUser = idUser;
        this.rating = rating;
    }

    public String getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(String idMovie) {
        this.idMovie = idMovie;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
