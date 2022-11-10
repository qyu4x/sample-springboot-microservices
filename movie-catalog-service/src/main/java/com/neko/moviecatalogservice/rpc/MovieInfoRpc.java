package com.neko.moviecatalogservice.rpc;

import com.neko.moviecatalogservice.model.apiresponse.WebMovieInfoReponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MovieInfoRpc {

    private RestTemplate restTemplate;

    @Autowired
    public MovieInfoRpc(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WebMovieInfoReponse getMovieInfoResponseById(String movieId) {
        return restTemplate.getForObject("http://localhost:8082/movieinfo/find/" + movieId, WebMovieInfoReponse.class);
    }
}
