package com.dia.App_Api_RESTFUL.controller;

import com.dia.App_Api_RESTFUL.model.ProduitType;
import com.dia.App_Api_RESTFUL.service.Produit_TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProduitTypeController {
    @Autowired private Produit_TypeService produit_typeService;

    @GetMapping("/produitTypes")
    public List<ProduitType> getProduits(){
        return produit_typeService.getAllProduit();
    }
    // add produits
    @PostMapping("/produitTypes/add")
    public void addproduitType(@RequestBody ProduitType produitType){
        produit_typeService.addProduitType(produitType);
    }
    // update type produit
    @PutMapping("/produitTypes/{is}/edit")
    public void editProduiType(@PathVariable("id") Integer id,@RequestBody ProduitType produitType){
        produit_typeService.editProduitType(produitType);
    }
    @DeleteMapping("/produitTypes/{id}/delete")
    public void deleteProduitType(@PathVariable Integer id){
        produit_typeService.deteleProduitType(id);
    }
}
