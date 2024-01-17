package com.xworkz.january.boot;

import com.xworkz.january.boot.entity.ShopCRUDEntity;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ShopCRUDRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("Entity Manager EM:" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("Entity Transaction ET" + et);
        et.begin();
        System.out.println("ET begin");

        ShopCRUDEntity entityFromDB= em.find(ShopCRUDEntity.class,12);

        if(entityFromDB != null){
            entityFromDB.setAddress("KORATAGERE");
            entityFromDB.setOwner_name("Vandana");
            em.merge(entityFromDB);
            System.out.println("DATA Updated" + entityFromDB);
        }else {
            System.out.println("Not updated");
        }


        et.commit();
        System.out.println("Entity Transaction get committed");
        em.close();
        emf.close();
        System.out.println("EM and EMF closed");

        }

    }

