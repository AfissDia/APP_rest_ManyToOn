package com.dia.App_Api_RESTFUL.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProduitType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    @OneToMany(mappedBy = "produitType")
    private Collection<Produit> produit;

    public Collection<Produit> getProduit() {
        return produit;
    }

    public void setProduit(Collection<Produit> produit) {
        this.produit = produit;
    }
}
