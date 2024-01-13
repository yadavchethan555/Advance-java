package com.xworkz.january.boot;

import com.xworkz.january.boot.entity.ResumeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ResumeJPARunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("Entity Manager EM:" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("Entity Transaction ET" + et);
        et.begin();
        System.out.println("ET begins");
        System.out.println("Starting operation");
        ResumeEntity resumeEntity = new ResumeEntity(1,"CHETHAN H K","BIET DAVANAGERE", "CIVIL ENGINEERING","TUMKUR","INDIAN");
        em.persist(resumeEntity);
        et.commit();

        System.out.println("ET commit");
        System.out.println("Closing EM, EMF");

        em.close();
        emf.close();
    }
}

