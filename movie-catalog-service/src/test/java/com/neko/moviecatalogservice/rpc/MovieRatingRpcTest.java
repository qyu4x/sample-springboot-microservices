package com.neko.moviecatalogservice.rpc;

import com.neko.moviecatalogservice.model.apiresponse.WebMovieRatingResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MovieRatingRpcTest {

    private MovieRatingRpc movieInfoRpc;

    @Autowired
    public MovieRatingRpcTest(MovieRatingRpc movieInfoRpc) {
        this.movieInfoRpc = movieInfoRpc;
    }

    @Test
    void testCallMovieRatingService() {

        WebMovieRatingResponse movieRatingResponse = movieInfoRpc.getRatingByIdUser("id");
        Assertions.assertEquals(1, movieRatingResponse.getData().size());
        Assertions.assertEquals(4.5, movieRatingResponse.getData().get(0).getRating());

    }
}