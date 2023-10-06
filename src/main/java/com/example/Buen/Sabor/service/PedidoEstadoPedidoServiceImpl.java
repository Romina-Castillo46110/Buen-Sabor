package com.example.Buen.Sabor.service;

import com.example.Buen.Sabor.entities.PedidoEstadoPedido;
import com.example.Buen.Sabor.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PedidoEstadoPedidoServiceImpl extends BaseServiceImpl<PedidoEstadoPedido, Long> implements PedidoEstadoPedidoService {

    public PedidoEstadoPedidoServiceImpl(BaseRepository<PedidoEstadoPedido, Long> baseRepository) {
        super(baseRepository);
    }
}
