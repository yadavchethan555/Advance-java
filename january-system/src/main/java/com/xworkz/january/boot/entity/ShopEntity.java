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
@Table(name="shop_details")
public class ShopEntity {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="Shop_name")
    private  String Shop_Name;
    @Column(name="Prop_name")
    private  String Prop_Name;
    @Column(name="Area_name")
    private  String Area_Name;
    @Column(name="Type_of_Store")
    private String Type_Of_Store;
}
