package com.serafim.shorter_url_challenge.domain.shorter_url;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "shorter_url")
public class ShorterUrl {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "short_url")
    private String shortUrl;

    @Column(name = "original_url")
    private String originalUrl;

    private Integer clicks = 0;

    public ShorterUrl(String id, String shortUrl, String originalUrl) {
        this.id = id;
        this.shortUrl = shortUrl;
        this.originalUrl = originalUrl;
    }
}
