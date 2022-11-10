package com.neko.moviecatalogservice.rpc;

import com.neko.moviecatalogservice.model.apiresponse.WebMovieInfoReponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MovieInfoRpcTest {
    private MovieInfoRpc movieInfoRpc;

    @Autowired
    public MovieInfoRpcTest(MovieInfoRpc movieInfoRpc) {
        this.movieInfoRpc = movieInfoRpc;
    }

    @Test
    void testCallMovieInfoService() {

        WebMovieInfoReponse movieInfoResponse = movieInfoRpc.getMovieInfoResponseById("1");

        Assertions.assertEquals("Kaguya sama ultra romantic", movieInfoResponse.getData().getTitle());

    }
}