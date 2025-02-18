package org.example.SERVICE;

import jakarta.persistence.TypedQuery;
import org.example.ENTITY.Order.OrderProduct;

import java.util.ArrayList;

import static org.example.DAO.Main.entityManager;

public class OderProductService {

    public OrderProduct findOrderProduct(int id){
        entityManager.clear();
        return entityManager.find(OrderProduct.class,id);
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
