package com.example.Buen.Sabor.controllet;
import com.example.Buen.Sabor.entities.DetalleNotaCredito;
import com.example.Buen.Sabor.service.DetalleNotaCreditoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detalleNotaCredito")
public class DetalleNotaCreditoController extends BaseControllerImpl<DetalleNotaCredito, DetalleNotaCreditoServiceImpl>{
}
