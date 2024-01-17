package com.xworkz.january.boot;

import com.xworkz.january.boot.entity.ToyEntity;
import com.xworkz.january.boot.entity.TrafficFineCRUDEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrafficFineCRUDRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("Entity Manager EM:" + em);
        EntityTransaction et = em.getTransaction();
        System.out.println("Entity Transaction ET" + et);
        et.begin();
/*
        System.out.println("ET begin");
        TrafficFineCRUDEntity trafficFineCRUDEntity = new TrafficFineCRUDEntity(1,"Signal Jump","Chandre Gowda","KA07 EB2334",1500);
        em.persist(trafficFineCRUDEntity);
        System.out.println("Operation Complete");

        //to delete we need to find first to find go this:
//          TrafficFineCRUDEntity trafficFineCRUDEntity1 = em.find(TrafficFineCRUDEntity.class,1);
//        if(trafficFineCRUDEntity1 != null){
//             em.remove(trafficFineCRUDEntity1);
//            System.out.println("Data deleted succesfully");
//        }else{
//            System.out.println("Data not deleted ");
//        }

//        TrafficFineCRUDEntity trafficFineCRUD3 = new TrafficFineCRUDEntity(2,"No helmet","Channa","KA05 EB2334",500);
//        em.persist(trafficFineCRUD3);
//        System.out.println("Operation Complete");



         TrafficFineCRUDEntity trafficFineCRUD = new TrafficFineCRUDEntity(2,"Overspeed","RANGESHA","MP06 AP7878",700);
             em.persist(trafficFineCRUD);
        System.out.println("Operation Complete");

 */


                // 47 to 59 update operation
        TrafficFineCRUDEntity entityFromDB= em.find(TrafficFineCRUDEntity.class,1)  ; // START with em.

        //for UPDATE operation 31 to 37
        if (entityFromDB!= null) {
            entityFromDB.setViolation("HIT AND RUN");
            entityFromDB.setVehicle_owner("Chenna");
            em.merge(entityFromDB);
            System.out.println("Data updated" + entityFromDB);

        }else{
            System.out.println("Data not updated");
        }




        et.commit();
        System.out.println("ET commit");
        em.close();
        emf.close();
        System.out.println("Closing EM, EMF");
    }
}
