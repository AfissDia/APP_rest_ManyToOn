package com.dia.App_Api_RESTFUL.repository;

import com.dia.App_Api_RESTFUL.model.ProduitType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Produit_TypeRepository extends JpaRepository<ProduitType,Integer> {
}
