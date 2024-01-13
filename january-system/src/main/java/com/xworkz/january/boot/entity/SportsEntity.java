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
@Table(name="sports_details")
public class SportsEntity {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="sport_name")
    private String sport_Name;
    @Column(name="country_name")
    private String country_Name;
    @Column(name="captain_name")
    private String captain_Name;
    @Column(name="Type_of_sports")
    private String type_of_sports;
    @Column(name="Coach_name")
    private String coach_name;
}
