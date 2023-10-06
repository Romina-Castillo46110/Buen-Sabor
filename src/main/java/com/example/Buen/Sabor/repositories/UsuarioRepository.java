package com.example.Buen.Sabor.repositories;

import com.example.Buen.Sabor.entities.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario, Long> {
}
