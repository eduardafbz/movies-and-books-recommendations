package com.eduardafbz.moviesbooksrecommendations.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String gender;
    private Double averageRating;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
    private List<Ratings> ratings;

}