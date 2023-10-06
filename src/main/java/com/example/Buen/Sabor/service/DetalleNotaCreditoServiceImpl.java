package com.example.Buen.Sabor.service;

import com.example.Buen.Sabor.entities.DetalleNotaCredito;
import com.example.Buen.Sabor.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DetalleNotaCreditoServiceImpl extends BaseServiceImpl<DetalleNotaCredito, Long> implements DetalleNotaCreditoService {

    public DetalleNotaCreditoServiceImpl(BaseRepository<DetalleNotaCredito, Long> baseRepository) {
        super(baseRepository);
    }
}
