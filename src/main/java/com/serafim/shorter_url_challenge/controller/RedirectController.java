package com.serafim.shorter_url_challenge.controller;

import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrl;
import com.serafim.shorter_url_challenge.service.ShorterUrlService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class RedirectController {

    @Autowired
    private ShorterUrlService shorterUrlService;

    @GetMapping("{id}")
    public ResponseEntity<Void> redirectLink(@PathVariable("id") String id, HttpServletResponse httpServletResponse) {
        ShorterUrl shorterUrl = shorterUrlService.getById(id);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setLocation(URI.create(shorterUrl.getOriginalUrl()));

        return ResponseEntity.status(HttpStatus.FOUND).headers(httpHeaders).build();
    }
}
