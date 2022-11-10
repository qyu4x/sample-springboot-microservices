package com.neko.moviecatalogservice.model.apiresponse;

import com.neko.moviecatalogservice.model.response.MovieInfoResponse;

public class WebMovieInfoReponse {

    private Integer code;

    private String status;

    private MovieInfoResponse data;

    public WebMovieInfoReponse() {
    }

    public WebMovieInfoReponse(Integer code, String status, MovieInfoResponse data) {
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

    public MovieInfoResponse getData() {
        return data;
    }

    public void setData(MovieInfoResponse data) {
        this.data = data;
    }
}
