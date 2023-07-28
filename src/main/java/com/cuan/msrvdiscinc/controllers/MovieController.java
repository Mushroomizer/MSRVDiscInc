package com.cuan.msrvdiscinc.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movie")
public class MovieController {
    private final String httpSuccessMessage;

    public MovieController(String httpSuccessMessage) {
        this.httpSuccessMessage = httpSuccessMessage;
    }

    @GetMapping("/list")
    public ResponseEntity<?> getMovieList() {
        return ResponseEntity.ok(httpSuccessMessage);
    }

    @PostMapping("/echo")
    public ResponseEntity<?> echo(@RequestBody String message) {
        return ResponseEntity.ok(message);
    }

}
