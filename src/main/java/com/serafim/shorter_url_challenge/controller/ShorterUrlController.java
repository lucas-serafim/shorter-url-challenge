package com.serafim.shorter_url_challenge.controller;

import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrl;
import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrlRequestDTO;
import com.serafim.shorter_url_challenge.service.ShorterUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/short-url")
public class ShorterUrlController {

    @Autowired
    private ShorterUrlService shorterUrlService;

    @PostMapping
    public ShorterUrl createUrl(@RequestBody ShorterUrlRequestDTO body) {
        return shorterUrlService.createUrl(body);
    }
}
