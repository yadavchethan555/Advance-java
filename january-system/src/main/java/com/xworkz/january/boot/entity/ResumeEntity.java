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
@Table(name = "resume_details")
public class ResumeEntity {
    @Id
    @Column(name = "id")
    private int id;
      @Column(name ="Candidate_name")
    private String Candidate_Name;
     @Column(name = "college")
      private String College;
     @Column(name = "branch")
     private String Branch;
       @Column(name="place")
     private String Place;
       @Column(name = "nationality")
     private  String Nationality;

}
