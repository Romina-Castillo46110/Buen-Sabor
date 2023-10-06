package com.example.Buen.Sabor.service;

import com.example.Buen.Sabor.entities.ArticuloIngrediente;
import com.example.Buen.Sabor.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticuloIngredienteServiceImpl extends BaseServiceImpl<ArticuloIngrediente, Long> implements ArticuloIngredienteService {
    @Autowired
    public ArticuloIngredienteServiceImpl(BaseRepository<ArticuloIngrediente, Long> baseRepository) {
        super(baseRepository);
    }
}
