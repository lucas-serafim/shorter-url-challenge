package com.serafim.shorter_url_challenge.domain.shorter_url;

public record ShorterUrlResponseDTO(
        String id,
        String shortUrl,
        String originalUrl,
        Integer clicks
) {
}
