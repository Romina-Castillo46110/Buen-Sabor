package com.example.Buen.Sabor.service;

import com.example.Buen.Sabor.entities.CompraIngredientes;
import com.example.Buen.Sabor.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompraIngredientesServiceImpl extends BaseServiceImpl<CompraIngredientes, Long> implements CompraIngredientesService {

    public CompraIngredientesServiceImpl(BaseRepository<CompraIngredientes, Long> baseRepository) {
        super(baseRepository);
    }
}
