package com.devsuperior.dscommerce.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authoriry;

    public Role() {
    }

    public Role(Long id, String authoriry) {
        this.id = id;
        this.authoriry = authoriry;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthoriry() {
        return authoriry;
    }

    public void setAuthoriry(String authoriry) {
        this.authoriry = authoriry;
    }
}
