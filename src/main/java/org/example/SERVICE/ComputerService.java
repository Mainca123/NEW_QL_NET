package org.example.SERVICE;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.ENTITY.Computer.Computer;
import org.example.ENTITY.Computer.Status;

import java.util.ArrayList;

import static org.example.DAO.Main.entityManager;

public class ComputerService {

    public void addComputer(Computer computer){
        entityManager.getTransaction().begin();
        entityManager.merge(computer);
        entityManager.getTransaction().commit();
    }

    public ArrayList<Computer> selectAllComputer(){
        TypedQuery<Computer> query = entityManager.createQuery("Select c from Computer c", Computer.class);
        return  (ArrayList<Computer>) query.getResultList();
    }

    public void deleteComputer(Computer computer){
        entityManager.getTransaction().begin();
        entityManager.remove(computer);
        entityManager.getTransaction().commit();
    }

    public Computer setNewComputer(String nameTXT, String statusTXT){
        Status status = null;
        for(Status statusCheck : Status.values())
            if(statusCheck.getDescription().equals(statusTXT))
                status = statusCheck;
        if(status == null)
            status = Status.AVAILABLE;
        return new Computer(nameTXT,status);
    }

    public Computer findComputer(String nameComputer){
        return entityManager.find(Computer.class,nameComputer);
    }
}
