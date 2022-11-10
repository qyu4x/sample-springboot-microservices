package com.neko.moviecatalogservice.model.apiresponse;

import com.neko.moviecatalogservice.model.response.MovieRatingResponse;

import java.util.List;

public class WebMovieRatingResponse {

    private Integer code;

    private String status;

    private List<MovieRatingResponse> data;

    public WebMovieRatingResponse() {
    }

    public WebMovieRatingResponse(Integer code, String status, List<MovieRatingResponse> data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<MovieRatingResponse> getData() {
        return data;
    }

    public void setData(List<MovieRatingResponse> data) {
        this.data = data;
    }
}
