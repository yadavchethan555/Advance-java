package com.xworkz.january.boot;

import com.xworkz.january.boot.entity.SportCRUDEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SportCRUDRunner {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("x-workz");
        EntityManager em = emf.createEntityManager();
        System.out.println("Entity Manager" + em);
       EntityTransaction et =  em.getTransaction();
        System.out.println("Entity Transaction" + et);
        et.begin();
        System.out.println("ET begin");

            SportCRUDEntity   entityFromDB = em.find(SportCRUDEntity.class,10);
            if(entityFromDB != null){
                entityFromDB.setOrigin_Country("INDIA");
                entityFromDB.setCaptain_Name("VIRAT KOHLI");
                em.merge(entityFromDB);
                System.out.println("Data updated" + entityFromDB);
            }else {
                System.out.println("Data not get updated");
            }
            et.commit();
        System.out.println("ET get commited");
        em.close();
        emf.close();
        System.out.println("EM AND EMF get closed");

    }
}
