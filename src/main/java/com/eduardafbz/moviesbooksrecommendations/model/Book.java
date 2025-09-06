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
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    private String title;
    private String author;
    private String gender;
    private Double averageRating;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Rate> ratings;

}