package com.xworkz.january.boot;


import com.xworkz.january.boot.entity.TrafficEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficJPARunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("Entity Manager EM:" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("Entity Transaction ET" + et);
        et.begin();
        System.out.println("ET begins");
        System.out.println("Starting operation");
        TrafficEntity trafficEntity = new TrafficEntity(1, "BANGALORE", "Rajaji Nagar", "Omkar", "7PM", "BHASHYAM CIRCLE");
        em.persist(trafficEntity);

        et.commit();

        System.out.println("ET commit");
        System.out.println("Closing EM, EMF");

        em.close();
        emf.close();
    }

    }




