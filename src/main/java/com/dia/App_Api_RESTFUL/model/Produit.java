package com.dia.App_Api_RESTFUL.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prix;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @ManyToOne()
    @JoinColumn(name = "produit_id", insertable = false, updatable = false)
    private ProduitType produitType;
    private Integer produit_id;
}
