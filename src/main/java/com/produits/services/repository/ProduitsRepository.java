package com.produits.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.produits.services.model.Produit;

public interface ProduitsRepository extends JpaRepository<Produit, Long>{

}
