package application;

import domain.People;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {


    public static void main(String[] args) {

        People p1 = new People(null, "Carlos", "Carlos@gmail.com");
        People p2 = new People(null, "Ana", "Ana@gmail.com");
        People p3 = new People(null, "Sara", "sara@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p3);
        em.getTransaction().commit();

        IO.println("Finish");
        em.close();
        emf.close();


    }
}

