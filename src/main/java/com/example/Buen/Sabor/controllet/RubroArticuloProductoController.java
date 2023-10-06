package com.example.Buen.Sabor.controllet;
import com.example.Buen.Sabor.entities.RubroArticuloProducto;
import com.example.Buen.Sabor.service.RubroArticuloProductoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/rubroArticuloProducto")
public class RubroArticuloProductoController extends BaseControllerImpl<RubroArticuloProducto, RubroArticuloProductoServiceImpl>{
}
