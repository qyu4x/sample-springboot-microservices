package com.neko.movieratingservice.controller;

import com.neko.movieratingservice.model.response.MovieRatingResponse;
import com.neko.movieratingservice.model.response.WebResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/movierating")
public class MovieRatingController {

    @GetMapping("/rating/{idUser}")
    public WebResponse<List<MovieRatingResponse>> getAllRatingByIdUser(@PathVariable("idUser") String idUser) {
        List<MovieRatingResponse> movieRatingResponses = Arrays.asList(
                new MovieRatingResponse(
                        "1",
                        idUser,
                        4.5
                )
        );

        return new WebResponse<>(
          200,
          "OK",
                movieRatingResponses
        );

    }
}
