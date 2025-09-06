package com.eduardafbz.moviesbooksrecommendations.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String username;
    private Double historicalRating;

    @OneToMany (mappedBy = "user", cascade = CascadeType.ALL)
    private List<Rate> ratings;

}