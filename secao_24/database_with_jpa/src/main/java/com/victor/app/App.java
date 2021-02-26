package com.victor.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.victor.entities.User;

public class App {
    public static void main(String[] args) {
        // User p1 = new User(null, "Carlos da Silva", "carlos@gmail.com");
        // User p2 = new User(null, "Joaquim Torres", "joaquim@gmail.com");
        // User p3 = new User(null, "Ana Maria", "ana@gmail.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
        EntityManager em = emf.createEntityManager();

        // Create
        // em.getTransaction().begin();
        // em.persist(p1);
        // em.persist(p2);
        // em.persist(p3);
        // em.getTransaction().commit();

        // Read
        User user = em.find(User.class, 2);

        // System.out.println(user);

        // Remove
        // precisa colocar transação, sempre que nao for uma simples consulta
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
