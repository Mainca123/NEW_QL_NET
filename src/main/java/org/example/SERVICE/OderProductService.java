package org.example.SERVICE;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.example.ENTITY.Computer.Computer;
import org.example.ENTITY.Order.OrderProduct;

import java.util.ArrayList;
import java.util.List;

import static org.example.DAO.Main.entityManager;

public class OderProductService {

    public List<OrderProduct> findOrderProductsWithDetails() {
        String jpql = "SELECT op FROM OrderProduct op " +
                "JOIN FETCH op.order o " +
                "JOIN FETCH o.user u " +
                "JOIN FETCH op.product p";

        return entityManager.createQuery(jpql, OrderProduct.class).getResultList();
    }


    public OrderProduct findOrderProduct(int id){
        entityManager.clear();
        return entityManager.find(OrderProduct.class,id);
    }

    public ArrayList<OrderProduct> selectAllOrderProduct(int Order_id){
        entityManager.clear();
        TypedQuery<OrderProduct> query = entityManager.createQuery(
                "SELECT c FROM OrderProduct c WHERE c.order.id = :Order_id", OrderProduct.class
        );
        query.setParameter("Order_id",Order_id);
        return (ArrayList<OrderProduct>) query.getResultList();
    }

    public void deleteOrderProduct(OrderProduct orderProduct){
        entityManager.getTransaction().begin();
        entityManager.merge(orderProduct);
        entityManager.getTransaction().commit();
    }

    public void AddOrder(OrderProduct orderProduct){
        entityManager.getTransaction().begin();
        entityManager.merge(orderProduct);
        entityManager.getTransaction().commit();
    }

    public ArrayList<OrderProduct> selectAllOrder(){
        TypedQuery<OrderProduct> query = entityManager.createQuery(
                "Select o from OrderProduct o", OrderProduct.class);
        return (ArrayList<OrderProduct>) query.getResultList();
    }

}
