package com.example.Buen.Sabor.service;

import com.example.Buen.Sabor.entities.ArticuloIngrediente;
import com.example.Buen.Sabor.entities.ArticuloProducto;
import com.example.Buen.Sabor.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticuloProductoServiceImpl extends BaseServiceImpl<ArticuloProducto, Long> implements ArticuloProductoService {

    public ArticuloProductoServiceImpl(BaseRepository<ArticuloProducto, Long> baseRepository) {
        super(baseRepository);
    }
}
