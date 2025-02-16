package org.example.DAO;

import jakarta.persistence.EntityManager;
import org.example.ENTITY.USER.Role;
import org.example.ENTITY.USER.User;
import org.example.VIEW.TogetherSERVICE.HomeJFrame;
import org.mindrot.jbcrypt.BCrypt;

public class Main {
    public static void main(String[] args) {
        new HomeJFrame().setVisible(true);
        User user = new User("0123456789","Admin", BCrypt.hashpw("0000", BCrypt.gensalt()),0, Role.ADMIN);
        //Thêm vào CSDL
        User userCheck = entityManager.find(User.class, user.getPhone());
        if(userCheck == null) {
            entityManager.getTransaction().begin();
            entityManager.merge(user);
            entityManager.getTransaction().commit();
        }
    }
    public static EntityManager entityManager = HibernateUtil.getEntityManager();
}