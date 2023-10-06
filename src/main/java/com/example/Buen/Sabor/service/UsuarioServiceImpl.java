package com.example.Buen.Sabor.service;

import com.example.Buen.Sabor.entities.Usuario;
import com.example.Buen.Sabor.repositories.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario, Long> implements UsuarioService {

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository) {
        super(baseRepository);
    }
}
