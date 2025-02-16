package org.example.ENTITY.Order;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Hang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String tenHang;

    @Column(nullable = false)
    private double giaTien;

    @OneToMany(mappedBy = "hang", cascade = CascadeType.ALL)
    private Set<ChiTietDonHang> orderHangs;

    public Hang() {}

    public Hang(String tenHang, double giaTien) {
        this.tenHang = tenHang;
        this.giaTien = giaTien;
    }

    // Getter & Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public Set<ChiTietDonHang> getOrderHangs() {
        return orderHangs;
    }

    public void setOrderHangs(Set<ChiTietDonHang> orderHangs) {
        this.orderHangs = orderHangs;
    }
}
