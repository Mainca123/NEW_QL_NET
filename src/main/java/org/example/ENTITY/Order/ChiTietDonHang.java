package org.example.ENTITY.Order;

import jakarta.persistence.*;

@Entity
public class ChiTietDonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // Khóa chính tự tăng

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Don order;  // Khóa ngoại

    @ManyToOne
    @JoinColumn(name = "hang_id", nullable = false)
    private Hang hang;  // Khóa ngoại

    @Column(nullable = false)
    private int soLuong;

    public ChiTietDonHang() {}

    public ChiTietDonHang(Don order, Hang hang, int soLuong) {
        this.order = order;
        this.hang = hang;
        this.soLuong = soLuong;
    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Don getOrder() {
        return order;
    }

    public void setOrder(Don order) {
        this.order = order;
    }

    public Hang getHang() {
        return hang;
    }

    public void setHang(Hang hang) {
        this.hang = hang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
