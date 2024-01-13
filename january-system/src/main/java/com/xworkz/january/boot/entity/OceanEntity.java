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
@Table(name = "ocean_details")
public class OceanEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "ocean_name")
    private String oceanName;
    @Column(name = "river_name")
    private String riverName;
    @Column(name = "state")
    private String sate;
    @Column(name = "country")
    private String country;
    @Column(name = "islands")
    private String islands;


}
