package com.xworkz.january.boot;

import com.xworkz.january.boot.entity.ToyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ToyJPARunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("Entity Manager EM:" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("Entity Transaction ET" + et);
        et.begin();
        System.out.println("ET begin");

                        //to delete we need to find first to find go this:
      //  ToyEntity toyEntity = em.find(ToyEntity.class,1);
//        if(toyEntity != null){
////             em.remove(toyEntity);
////            System.out.println("Data deleted succesfully");
//        }else{
//            System.out.println("Data not deleted ");
//        }

       ToyEntity entityFromDB= em.find(ToyEntity.class,1)  ; // START with em.
        System.out.println("Entity Found" + entityFromDB);
        //for UPDATE operation 31 to 37
        if (entityFromDB!= null) {
            entityFromDB.setToy_name("TEDDY");
            entityFromDB.setColour("RED");
            em.merge(entityFromDB);

        }

     // USED TO FETCH OR PRINT THE DATA (If i execute along with this code it means before this u deleted row here again u added it seems no change)
//        System.out.println("Starting operation");
//        ToyEntity toyentity = new ToyEntity(1, "Robot", "silver", 9999, "metal");
//        em.persist(toyentity);
//        System.out.println("Operation Complete");
//
//        //for update operation see festival file
//
        et.commit();
        System.out.println("ET commit");
        System.out.println("Closing EM, EMF");

        em.close();
        emf.close();
    }


    }

