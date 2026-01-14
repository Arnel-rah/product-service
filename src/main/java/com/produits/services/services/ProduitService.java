package com.produits.services.services;

import org.springframework.stereotype.Service;

import com.produits.services.repository.ProduitsRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class ProduitService {
    private final ProduitsRepository produitsRepository;
       
}
