package org.example.SERVICE;

import jakarta.persistence.TypedQuery;
import org.example.ENTITY.Order.A_Order;
import org.example.ENTITY.Order.OrderProduct;

import java.lang.reflect.Type;
import java.util.ArrayList;

import static org.example.DAO.Main.entityManager;

public class A_OrderService {

    public ArrayList<A_Order> findOrder_ByPhone(String phone){
        entityManager.clear();
        TypedQuery<A_Order> query = entityManager.createQuery(
                "SELECT c FROM A_Order c WHERE c.user.phone =: phone", A_Order.class
        );
        query.setParameter("phone",phone);
        return (ArrayList<A_Order>) query.getResultList();
    }

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

    public ArrayList<A_Order> selectAllOrder(){
        entityManager.clear();
        TypedQuery<A_Order> query = entityManager.createQuery("Select a from A_Order a", A_Order.class);
        return (ArrayList<A_Order>) query.getResultList();
    }
}
