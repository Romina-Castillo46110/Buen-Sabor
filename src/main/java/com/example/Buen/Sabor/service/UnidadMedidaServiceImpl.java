package com.example.Buen.Sabor.service;

import com.example.Buen.Sabor.entities.UnidadMedida;
import com.example.Buen.Sabor.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UnidadMedidaServiceImpl extends BaseServiceImpl<UnidadMedida, Long> implements UnidadMedidaService {

    public UnidadMedidaServiceImpl(BaseRepository<UnidadMedida, Long> baseRepository) {
        super(baseRepository);
    }
}
