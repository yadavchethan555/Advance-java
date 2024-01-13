package com.xworkz.january.boot;

import com.xworkz.january.boot.entity.OceanEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OceanJPARunner {
    public static void main(String[] args) {
        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("Entity Manager EM:" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("Entity Transaction ET" + et);
        et.begin();
        System.out.println("ET begin");
        System.out.println("Starting operation");
        OceanEntity oceanEntity = new OceanEntity(1,"Arabian Sea","Kauveri","Karnataka","INDIA IRAN MALDIVES","Lakshadweep");
        em.persist(oceanEntity);
        System.out.println("Operation Complete");
        et.commit();

        System.out.println("ET commit");
        System.out.println("Closing EM, EMF");

        em.close();
        emf.close();

    }
}
