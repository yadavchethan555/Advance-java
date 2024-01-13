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
@Table(name="traffic_details")
public class TrafficEntity {
   @Id
   @Column(name = "id")
    private int id;
    @Column(name = "city_name")
    private String city_Name;
    @Column(name = "area_name")
    private  String area_Name;
    @Column(name = "inspector_name")
    private  String inspector_Name;
    @Column(name = "peakhour")
    private  String peakhour;
    @Column(name = "circle_name")
    private  String circle_Name;
}
