package com.example.Buen.Sabor.service;

import com.example.Buen.Sabor.entities.DetalleCompraIngrediente;
import com.example.Buen.Sabor.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetalleCompraIngredienteServiceImpl extends BaseServiceImpl<DetalleCompraIngrediente, Long> implements DetalleCompraIngredienteService {
    public DetalleCompraIngredienteServiceImpl(BaseRepository<DetalleCompraIngrediente, Long> baseRepository) {
        super(baseRepository);
    }
}
