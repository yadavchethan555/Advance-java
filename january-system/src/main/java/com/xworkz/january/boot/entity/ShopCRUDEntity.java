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
@AllArgsConstructor
@NoArgsConstructor   //if not provided update wont works
@Table(name = "shop_details")
public class ShopCRUDEntity {

     @Id
     @Column(name = "id")
    private  int id;
     @Column(name = "owner_name")
    private String owner_name;
     @Column(name = "gst_No")
    private String gst_No;
    @Column(name = "address")
    private  String address;
    @Column(name = "pincode")
    private  long pincode;
}
