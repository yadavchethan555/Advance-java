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
@NoArgsConstructor
@Table(name = "fine_details")
public class TrafficFineCRUDEntity {
    @Id
    @Column(name = "id")
    private  int id;
    @Column(name = "violation")
    private  String violation;
    @Column(name = "vehicle_owner")
    private  String vehicle_owner;
    @Column(name = "vehicle_no")
    private  String vehicle_no;
    @Column(name = "fine_in_rupees")
    private  int fine_in_rupees;


}
