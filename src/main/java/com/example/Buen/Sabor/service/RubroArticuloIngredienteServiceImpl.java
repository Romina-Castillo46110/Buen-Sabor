package com.example.Buen.Sabor.service;

import com.example.Buen.Sabor.entities.RubroArticuloIngrediente;
import com.example.Buen.Sabor.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RubroArticuloIngredienteServiceImpl extends BaseServiceImpl<RubroArticuloIngrediente, Long> implements RubroArticuloIngredienteService {

    public RubroArticuloIngredienteServiceImpl(BaseRepository<RubroArticuloIngrediente, Long> baseRepository) {
        super(baseRepository);
    }
}
