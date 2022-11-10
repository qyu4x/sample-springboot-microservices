package com.neko.moviecatalogservice.controller;

import com.neko.moviecatalogservice.model.apiresponse.WebMovieInfoReponse;
import com.neko.moviecatalogservice.model.apiresponse.WebMovieRatingResponse;
import com.neko.moviecatalogservice.model.response.MovieCatalogResponse;
import com.neko.moviecatalogservice.model.response.WebResponse;
import com.neko.moviecatalogservice.rpc.MovieInfoRpc;
import com.neko.moviecatalogservice.rpc.MovieRatingRpc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/moviecatalog")
public class MovieCatalogContoller {

    private MovieInfoRpc movieInfoRpc;

    private MovieRatingRpc movieRatingRpc;

    @Autowired
    public MovieCatalogContoller(MovieInfoRpc movieInfoRpc, MovieRatingRpc movieRatingRpc) {
        this.movieInfoRpc = movieInfoRpc;
        this.movieRatingRpc = movieRatingRpc;
    }

    @GetMapping("/list/{userId}")
    public WebResponse<List<MovieCatalogResponse>> getListMovieByUserId(@PathVariable("userId") String userId) {
        WebMovieRatingResponse ratingResponses = movieRatingRpc.getRatingByUserId(userId);
        List<MovieCatalogResponse> movieCatalogResponse = ratingResponses.getData().stream().map(ratingResponse -> {
            WebMovieInfoReponse movieInfoReponse = movieInfoRpc.getMovieInfoResponseById(ratingResponse.getIdMovie());
            return new MovieCatalogResponse(
                    userId,
                    ratingResponse.getIdMovie(),
                    movieInfoReponse.getData().getTitle(),
                    movieInfoReponse.getData().getDescription(),
                    ratingResponse.getRating()
            );
        }).collect(Collectors.toList());

        return new WebResponse<>(
                200,
                "OK",
                movieCatalogResponse
        );
    }
}
