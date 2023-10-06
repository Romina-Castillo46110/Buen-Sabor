package com.example.Buen.Sabor.service;

import com.example.Buen.Sabor.entities.NotaCredito;
import com.example.Buen.Sabor.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NotaCreditoServiceImpl extends BaseServiceImpl<NotaCredito, Long> implements NotaCreditoService {

    public NotaCreditoServiceImpl(BaseRepository<NotaCredito, Long> baseRepository) {
        super(baseRepository);
    }
}
