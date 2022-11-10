package com.neko.moviecatalogservice.rpc;

import com.neko.moviecatalogservice.model.apiresponse.WebMovieRatingResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieRatingRpc {

    private RestTemplate restTemplate;

    @Autowired
    public MovieRatingRpc(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WebMovieRatingResponse getRatingByUserId(String idUser) {
        return restTemplate.getForObject("http://localhost:8083/movierating/rating/" + idUser, WebMovieRatingResponse.class);
    }

}
