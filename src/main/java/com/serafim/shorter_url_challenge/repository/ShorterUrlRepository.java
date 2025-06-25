package com.serafim.shorter_url_challenge.repository;

import com.serafim.shorter_url_challenge.domain.shorter_url.ShorterUrl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShorterUrlRepository extends JpaRepository<ShorterUrl, String> {
}
