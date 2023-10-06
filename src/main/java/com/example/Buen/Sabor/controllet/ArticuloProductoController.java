package com.example.Buen.Sabor.controllet;

import com.example.Buen.Sabor.entities.ArticuloProducto;
import com.example.Buen.Sabor.service.ArticuloProductoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/articuloProductos")
public class ArticuloProductoController extends BaseControllerImpl<ArticuloProducto, ArticuloProductoServiceImpl>{
}
