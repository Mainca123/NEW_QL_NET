package org.example.SERVICE;

import org.example.ENTITY.Order.A_Order;

import static org.example.DAO.Main.entityManager;

public class A_OrderService {

    public A_Order findAOder(int id){
        entityManager.clear();
        return entityManager.find(A_Order.class,id);
    }

    public void setAOrder(A_Order aOrder){
        entityManager.getTransaction().begin();
        entityManager.merge(aOrder);
        entityManager.flush();
        entityManager.getTransaction().commit();
    }

    public void addAOrder(A_Order aOrder){
        entityManager.getTransaction().begin();
        entityManager.persist(aOrder);
        entityManager.flush();
        entityManager.getTransaction().commit();
    }

    public void deleteAOrder(A_Order aOrder){
        entityManager.getTransaction().begin();
        entityManager.remove(aOrder);
        entityManager.getTransaction().commit();
    }
}
