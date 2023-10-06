package com.example.Buen.Sabor.service;

import com.example.Buen.Sabor.entities.RubroArticuloProducto;
import com.example.Buen.Sabor.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RubroArticuloProductoServiceImpl extends BaseServiceImpl<RubroArticuloProducto, Long> implements RubroArticuloProductoService {

    public RubroArticuloProductoServiceImpl(BaseRepository<RubroArticuloProducto, Long> baseRepository) {
        super(baseRepository);
    }
}
