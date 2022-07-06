package com.dia.App_Api_RESTFUL.service;
import com.dia.App_Api_RESTFUL.model.Produit;
import com.dia.App_Api_RESTFUL.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    @Autowired
    private ProduitRepository produitRepository;

    //list produit
    public List<Produit> getAllProduit(){
        return produitRepository.findAll();
    }
    public List<Produit> getProduitTypeByProduit(Integer id){
        return produitRepository.getProduitTypeByProduit(id);
    }

    // add type produit
    public void addProduit(Produit produit){
        produitRepository.save(produit);
    }
    // update type produit
    public void editProduit(Produit produit){
        produitRepository.save(produit);
    }
    //delete produit
    public void deteleProduit(Integer id){
        produitRepository.deleteById(id);
    }
}
