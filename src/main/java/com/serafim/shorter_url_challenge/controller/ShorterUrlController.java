package com.serafim.shorter_url_challenge.controller;

import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrl;
import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrlRequestDTO;
import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrlResponseDTO;
import com.serafim.shorter_url_challenge.service.ShorterUrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ShorterUrlController {

    @Autowired
    private ShorterUrlService shorterUrlService;

    @PostMapping("/short-url")
    public ResponseEntity<ShorterUrl> createUrl(@RequestBody ShorterUrlRequestDTO body) {
        ShorterUrl shorterUrl = shorterUrlService.createUrl(body);
        return ResponseEntity.ok(shorterUrl);
    }

    @GetMapping("/links")
    public ResponseEntity<List<ShorterUrlResponseDTO>> findAll() {
        List<ShorterUrlResponseDTO> list = shorterUrlService.findAll();
        return ResponseEntity.ok(list);
    }
}
