package com.serafim.shorter_url_challenge.controller;

import com.serafim.shorter_url_challenge.domain.response.MessageResponse;
import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrl;
import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrlRequestDTO;
import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrlResponseDTO;
import com.serafim.shorter_url_challenge.service.ShorterUrlService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
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

    @DeleteMapping("/links/{id}")
    public ResponseEntity<MessageResponse> deleteUrl(@PathVariable("id") String id) {
        shorterUrlService.deleteUrl(id);
        return ResponseEntity.ok(new MessageResponse("Link deleted successfully."));
    }
}
