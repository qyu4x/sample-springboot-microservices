package com.neko.moviecatalogservice.model.response;

public class MovieCatalogResponse {

    private String userId;

    private String movieId;

    private String movieTitle;

    private String description;

    private Double rating;

    public MovieCatalogResponse() {
    }

    public MovieCatalogResponse(String userId, String movieId, String movieTitle, String description, Double rating) {
        this.userId = userId;
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.description = description;
        this.rating = rating;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}
