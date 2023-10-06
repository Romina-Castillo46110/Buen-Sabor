package com.example.Buen.Sabor.controllet;

import com.example.Buen.Sabor.entities.ArticuloIngrediente;
import com.example.Buen.Sabor.service.ArticuloIngredienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/articuloIngredientes")
public class ArticuloIngredienteController extends BaseControllerImpl<ArticuloIngrediente, ArticuloIngredienteServiceImpl>{
}
