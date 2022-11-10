package com.neko.movieinfoservice.controller;

import com.neko.movieinfoservice.model.response.MovieInfoResponse;
import com.neko.movieinfoservice.model.response.WebResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movieinfo")
public class MovieController {

    @GetMapping("/find/{id}")
    public WebResponse<MovieInfoResponse> getMovieById(@PathVariable("id") String id) {
        return new WebResponse<MovieInfoResponse>(
                200,
                "OK",
                new MovieInfoResponse(
                        id,
                        "Kaguya sama ultra romantic",
                        "test desc for id " + id
                )
        );
    };

}
