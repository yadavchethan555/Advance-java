package com.xworkz.january.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@AllArgsConstructor
@Table(name = "actor_details")

public class ActorEntity {
    @Id
    @Column(name = "id")
    private  int id;
    @Column(name = "actor_name")
    private String actor_name;
    @Column(name = "age")
    private  int age;
    @Column(name = "debut_movie")
    private  String debut_movie;
    @Column(name = "latest_movie")
    private  String latest_movie;
    @Column(name = "alltime_blockbuster")
    private  String alltime_blockbuster;

}
