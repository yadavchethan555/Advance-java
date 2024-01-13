package com.xworkz.january.boot;

import com.xworkz.january.boot.entity.SuperHeroEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JPARunner {
    public static void main(String[] args) {
//       EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
//        System.out.println(emf);        //PREVIOUS CLASS


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
       EntityManager em = emf.createEntityManager();
        System.out.println("Entity Manager EM:" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("Entity Transaction ET" + et);
        et.begin();
        System.out.println("ET begin");
        System.out.println("Starting operation");
        SuperHeroEntity superHeroEntity = new SuperHeroEntity(2, "Yash", "Rocky Bhai","Gold","India","Mother");
        em.persist(superHeroEntity);
        System.out.println("Operation Complete");
        et.commit();

        System.out.println("ET commit");
        System.out.println("Closing EM, EMF");

        em.close();
        emf.close();

    }
}
