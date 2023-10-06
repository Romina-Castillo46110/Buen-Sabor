package com.example.Buen.Sabor.controllet;
import com.example.Buen.Sabor.entities.PedidoEstadoPedido;
import com.example.Buen.Sabor.service.PedidoEstadoPedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/pedidoEstadoPedido")
public class PedidoEstadoPedidoController extends BaseControllerImpl<PedidoEstadoPedido, PedidoEstadoPedidoServiceImpl>{
}
