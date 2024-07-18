package com.ecommerce.dimensao.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "tb_order")
public class Order {

    @Id
    @Column(name = "ci_order")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "vl_total")
    private Long valorTotal;

    @Column(name = "dt_order")
    private Date dataOrder;

    @Column(name = "dt_delivery")
    private Date dataDelivery;

    @Column(name = "tp_status_delivery")
    private String tpStatusDelivery;

    @OneToOne
    @JoinColumn(name = "cd_customer")
    private Customer customer;

    @ManyToMany
    @JoinTable(name = "tb_order_product", joinColumns = @JoinColumn(name = "cd_order"), inverseJoinColumns = @JoinColumn(name = "cd_product"))
    private List<Product> produtos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Long valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataOrder() {
        return dataOrder;
    }

    public void setDataOrder(Date dataOrder) {
        this.dataOrder = dataOrder;
    }

    public Date getDataDelivery() {
        return dataDelivery;
    }

    public void setDataDelivery(Date dataDelivery) {
        this.dataDelivery = dataDelivery;
    }

    public String getTpStatusDelivery() {
        return tpStatusDelivery;
    }

    public void setTpStatusDelivery(String tpStatusDelivery) {
        this.tpStatusDelivery = tpStatusDelivery;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Product> produtos) {
        this.produtos = produtos;
    }

}
