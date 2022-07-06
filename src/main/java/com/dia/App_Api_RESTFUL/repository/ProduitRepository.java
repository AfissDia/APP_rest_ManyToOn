package com.dia.App_Api_RESTFUL.repository;

import com.dia.App_Api_RESTFUL.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Integer> {
   //@Query("SELECT produit_type from produit where produit.id = ?1")
    List<Produit> getProduitTypeByProduit(Integer id);
}
