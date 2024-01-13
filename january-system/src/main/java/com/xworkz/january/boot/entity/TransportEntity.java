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
@Table(name = "transport_details")
public class TransportEntity {
    @Id
    @Column(name = "id")
    private  int id;
    @Column(name = "transport_mode")
    private String transport_mode;
    @Column(name = "origin_name")
    private  String origin_name;
    @Column(name = "destination_name")
    private  String destination_name;
    @Column(name = "transport_company")
    private  String transport_company;
    @Column(name = "passanger_name")
    private  String passanger_name;


}
