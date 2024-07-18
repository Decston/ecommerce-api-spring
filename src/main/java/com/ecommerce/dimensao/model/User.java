package com.ecommerce.dimensao.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @Column(name = "ci_user")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nm_login")
    private String login;

    @Column(name = "nm_password")
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
