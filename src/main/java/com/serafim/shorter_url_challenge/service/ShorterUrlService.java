package com.serafim.shorter_url_challenge.service;

import com.serafim.shorter_url_challenge.domain.code.RandomCode;
import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrl;
import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrlRequestDTO;
import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrlResponseDTO;
import com.serafim.shorter_url_challenge.repository.ShorterUrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShorterUrlService {

    @Autowired
    private ShorterUrlRepository shorterUrlRepository;

    @Value("${api.endpoint}")
    private String endpoint;

    public ShorterUrl createUrl(ShorterUrlRequestDTO dto) {

        String randomCode = RandomCode.generateCode();
        String newUrl = endpoint + randomCode;

        ShorterUrl newShorterUrl = new ShorterUrl(randomCode, newUrl, dto.url());

        shorterUrlRepository.save(newShorterUrl);

        return newShorterUrl;
    }

    public List<ShorterUrlResponseDTO> findAll() {
        List<ShorterUrl> shorterUrls = shorterUrlRepository.findAll();

        return shorterUrls.stream().map(current -> new ShorterUrlResponseDTO(
                current.getId(),
                current.getShortUrl(),
                current.getOriginalUrl(),
                current.getClicks()
        )).toList();
    }
}
