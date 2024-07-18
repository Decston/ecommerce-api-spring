package com.ecommerce.dimensao.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_product")
public class Product {

    @Id
    @Column(name = "ci_product")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nm_product")
    private String nome;

    @Column(name = "vl_cost")
    private Long custo;

    @Column(name = "dt_posted")
    private Date dataPostagem;

    @OneToOne
    @JoinColumn(name = "cd_seller")
    private Seller seller;

    @OneToOne
    @JoinColumn(name = "cd_category")
    private Category category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCusto() {
        return custo;
    }

    public void setCusto(Long custo) {
        this.custo = custo;
    }

    public Date getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(Date dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
