package com.example.Buen.Sabor.controllet;
import com.example.Buen.Sabor.entities.DetalleCompraIngrediente;
import com.example.Buen.Sabor.service.DetalleCompraIngredienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detalleCompraIngrediente")
public class DetalleCompraIngredienteController extends BaseControllerImpl<DetalleCompraIngrediente, DetalleCompraIngredienteServiceImpl>{
}
