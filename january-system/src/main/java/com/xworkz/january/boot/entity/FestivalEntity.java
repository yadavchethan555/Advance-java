package com.xworkz.january.boot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "festival_details")
@AllArgsConstructor
@Data
public class FestivalEntity {
    @Id
    @Column(name = "id")
    private  int id;
    @Column(name = "festival_name")
    private String festival_name;
    @Column(name = "celebrated_month")
    private String celebrated_month;
    @Column(name = "relegion")
    private String relegion;
    @Column(name = "worship_god")
    private String worship_god;



}
