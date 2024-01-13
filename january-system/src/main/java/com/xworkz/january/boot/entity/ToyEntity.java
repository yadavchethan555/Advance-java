package com.xworkz.january.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@Table(name="toy_details")
@Data
@NoArgsConstructor     // to get default constructor
public class ToyEntity {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="toy_name")
    private String toy_name;
    @Column(name="colour")
    private  String colour;
    @Column(name="cost")
    private int cost;
    @Column(name="material")
    private  String material;



}
