package application;

import domain.People;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {


    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        People p = em.find(People.class, 4);
        em.remove(p);
        em.getTransaction().commit();



        IO.println(p);

        IO.println("Finish");
        em.close();
        emf.close();


    }
}

