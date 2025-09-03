package com.eduardafbz.moviesbooksrecommendations.repository;

import com.eduardafbz.moviesbooksrecommendations.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}