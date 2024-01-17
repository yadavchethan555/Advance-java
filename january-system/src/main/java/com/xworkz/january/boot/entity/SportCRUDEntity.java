package com.xworkz.january.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sport_details")

public class SportCRUDEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private  String name;
    @Column(name = "origin_country")
    private  String Origin_Country;
    @Column(name = "captain_name")
    private  String captain_Name;
    @Column(name = "total_players")
    private  int total_players;
}
