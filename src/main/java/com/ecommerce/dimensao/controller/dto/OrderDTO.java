package com.ecommerce.dimensao.controller.dto;

import com.ecommerce.dimensao.model.Customer;
import com.ecommerce.dimensao.model.Order;
import com.ecommerce.dimensao.model.Product;

import java.util.Date;
import java.util.List;

public class OrderDTO {

    private Long id;

    private Long valorTotal;

    private Date dataOrder;

    private Date dataDelivery;

    private String tpStatusDelivery;

    private Customer customer;

    private List<Product> produtos;

    public static OrderDTO converter(Order o) {
        var order = new OrderDTO();
        order.setId(o.getId());
        order.setValorTotal(o.getValorTotal());
        order.setDataOrder(o.getDataOrder());
        order.setDataDelivery(o.getDataDelivery());
        order.setTpStatusDelivery(o.getTpStatusDelivery());
        order.setCustomer(o.getCustomer());
        order.setProdutos(o.getProdutos());

        return order;
    }

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
