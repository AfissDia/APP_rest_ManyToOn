package com.dia.App_Api_RESTFUL.service;

import com.dia.App_Api_RESTFUL.model.ProduitType;
import com.dia.App_Api_RESTFUL.repository.Produit_TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Produit_TypeService {
    @Autowired private Produit_TypeRepository produit_typeRepository;

    //list produit
    public List<ProduitType> getAllProduit(){
        return produit_typeRepository.findAll();
    }
    // add type produit_type
    public void addProduitType(ProduitType produitType){
        produit_typeRepository.save(produitType);
    }
    // update type produit
    public void editProduitType(ProduitType produitType){
        produit_typeRepository.save(produitType);
    }
    //delete produitType
    public void deteleProduitType(Integer id){
        produit_typeRepository.deleteById(id);
    }
}
