package com.ecommerce.dimensao.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_seller")
public class Seller {

    @Id
    @Column(name = "ci_seller")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ds_endereco")
    private String endereco;

    @Column(name = "nr_phone")
    private Integer telefone;

    @Column(name = "ds_email")
    private String email;

    @OneToOne
    @JoinColumn(name = "cd_user")
    private User user;

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
