package com.dia.App_Api_RESTFUL.controller;

import com.dia.App_Api_RESTFUL.model.Produit;
import com.dia.App_Api_RESTFUL.service.ProduitService;
import com.dia.App_Api_RESTFUL.service.Produit_TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProduitController {
    @Autowired private ProduitService produitService;
    @Autowired private Produit_TypeService produit_TypeService;

    //
    @GetMapping("/produits")
    public List<Produit> getProduits(){
        return produitService.getAllProduit();
    }
    @GetMapping("/produits/{id}/produitTypes")
    public List<Produit> getProduitTypesByDepartment(@PathVariable("id") Integer id){
        return produitService.getProduitTypeByProduit(id);
    }
    // add produits
    @PostMapping("/produits/add")
    public void addproduit(@RequestBody Produit produit){
        produitService.addProduit(produit);
    }
    // update type produit
    @PutMapping("/produits/{is}/edit")
    public void editProdui(@PathVariable("id") Integer id,@RequestBody Produit produit){
        produitService.editProduit(produit);
    }
    @DeleteMapping("/produits/{id}/delete")
    public void deleteProduit(@PathVariable Integer id){
        produitService.deteleProduit(id);
    }
}
