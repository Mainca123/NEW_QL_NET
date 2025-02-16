package org.example.ENTITY.Order;

import jakarta.persistence.*;
import org.example.ENTITY.USER.User;

import java.util.Set;

@Entity
public class Don {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<ChiTietDonHang> orderHangs;

    public Don() {}

    public Don(User user) {
        this.user = user;
    }

    // Getter & Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<ChiTietDonHang> getOrderHangs() {
        return orderHangs;
    }

    public void setOrderHangs(Set<ChiTietDonHang> orderHangs) {
        this.orderHangs = orderHangs;
    }
}
