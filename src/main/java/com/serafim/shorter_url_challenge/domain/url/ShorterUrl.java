package com.serafim.shorter_url_challenge.domain.url;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "url")
public class ShorterUrl {

    @Id
    private String shortCode;

    private String shortUrl;
    private String originalUrl;

    public ShorterUrl(String shortUrl, String originalUrl) {
        this.shortUrl = shortUrl;
        this.originalUrl = originalUrl;
    }
}
