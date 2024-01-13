package com.xworkz.january.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@Table(name="film_details")
public class FilmEntity {
     @Id
     @Column(name = "id")
    private int id;
     @Column (name = "movie_name")
    private String movieName;
     @Column(name ="hero_name")
    private String hero_Name;
     @Column(name = "heroin_name")
    private String heroin_Name;
     @Column(name = "producer")
    private String producer;
     @Column(name = "director")
    private String director;

}
