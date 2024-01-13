package com.xworkz.january.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data    //GETTER SETTER
@Table(name = "super_hero")
@AllArgsConstructor


public class SuperHeroEntity {
    @Id                         //it is bcz of TO MAKE IT PRIMARY KEY otherwise gives error
    @Column(name = "id")
    private int id;

    @Column(name = "real_name")
    private String realName;
    @Column(name = "fictional_name")
    private String fictionalName;
    @Column(name = "power")
    private  String power;
    @Column(name = "country")
    private  String country;
    @Column(name = "weakness")
    private  String weakness;



}
