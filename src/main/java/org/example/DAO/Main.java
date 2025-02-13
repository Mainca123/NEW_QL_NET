package org.example.DAO;

import jakarta.persistence.EntityManager;
import org.example.ENTYTI.USER.Role;
import org.example.ENTYTI.USER.User;
import org.example.VIEW.HomeJFrame;
import org.mindrot.jbcrypt.BCrypt;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        new HomeJFrame().setVisible(true);
        User user = new User("0123456789","Giàng Seo Chính", BCrypt.hashpw("0000", BCrypt.gensalt()),"0", Role.ADMIN);
        //Thêm vào CSDL
        entityManager.getTransaction().begin();
        entityManager.merge(user);
        entityManager.getTransaction().commit();
    }
    public static EntityManager entityManager = HibernateUtil.getEntityManager();
}