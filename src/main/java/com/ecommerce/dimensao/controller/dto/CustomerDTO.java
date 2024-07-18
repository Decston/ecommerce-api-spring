package com.ecommerce.dimensao.controller.dto;

import com.ecommerce.dimensao.model.Customer;
import com.ecommerce.dimensao.model.User;

public class CustomerDTO {

    private Long id;

    private String endereco;

    private Integer telefone;

    private String email;

    private User user;

    public static CustomerDTO converter(Customer c) {
        var customer = new CustomerDTO();
        customer.setId(c.getId());
        customer.setEndereco(c.getEndereco());
        customer.setTelefone(c.getTelefone());
        customer.setEmail(c.getEmail());
        customer.setUser(c.getUser());

        return customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
