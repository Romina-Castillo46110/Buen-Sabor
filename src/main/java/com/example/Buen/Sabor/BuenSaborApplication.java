package com.example.Buen.Sabor;

import com.example.Buen.Sabor.entities.*;
import com.example.Buen.Sabor.enums.*;
import com.example.Buen.Sabor.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.Date;

@SpringBootApplication
public class BuenSaborApplication {
	@Autowired
	ArticuloIngredienteRepository articuloIngredienteRepository;
	@Autowired
	ArticuloProductoRepository articuloProductoRepository;
	@Autowired
	CompraIngredienteRepository compraIngredienteRepository;
	@Autowired
	DetalleArticuloManufacturadoRepository detalleArticuloManufacturadoRepository;
	@Autowired
	DetalleCompraIngredienteRepository detalleCompraIngredienteRepository;
	@Autowired
	DetalleFacturaRepository detalleFacturaRepository;
	@Autowired
	DetalleNotaCreditoRepository detalleNotaCreditoRepository;
	@Autowired
	DetallePedidoRepository detallePedidoRepository;
	@Autowired
	DomicilioRepository domicilioRepository;
	@Autowired
	FacturaRepository facturaRepository;
	@Autowired
	NotaCreditoRepository notaCreditoRepository;
	@Autowired
	PedidoRepository pedidoRepository;
	@Autowired
	PedidoEstadoPedidoRepository pedidoEstadoPedidoRepository;
	@Autowired
	PersonaRepository personaRepository;
	@Autowired
	RubroArticuloIngredienteRepository rubroArticuloIngredienteRepository;
	@Autowired
	RubroArticuloProductoRepository rubroArticuloProductoRepository;
	@Autowired
	UnidadMedidaRepository unidadMedidaRepository;
	@Autowired
	UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(BuenSaborApplication.class, args);
		System.out.println("Programa en Ejecucion");
	}
	@Bean
	public CommandLineRunner init(){
		return args -> {
			System.out.println("------------------------Estoy Funcionando------------------------");
			//creo el producto
			ArticuloProducto articuloProducto1 = new ArticuloProducto();
			articuloProducto1.setCosto(BigDecimal.valueOf(5.00));
			articuloProducto1.setDenominacion("Hamburguesa con Queso");
			articuloProducto1.setDescripcion("Hamburguesa de carne con Queso cheddar");
			articuloProducto1.setFechaAlta(new Date());
			articuloProducto1.setFechaBaja(new Date());
			articuloProducto1.setUrlImagen("");
			articuloProducto1.setPrecioVenta(BigDecimal.valueOf(2900));
			articuloProducto1.setTiempoEstimadoCocina(35);
			//creo el rubro del producto
			RubroArticuloProducto rubroArticuloProducto1 = new RubroArticuloProducto();
			rubroArticuloProducto1.setFechaHoraAlta(new Date());
			rubroArticuloProducto1.setDenominacion("Comida");
			rubroArticuloProducto1.setFechaHoraBaja(new Date());
			rubroArticuloProducto1.setFechaHoraModificacion(new Date());
			//asocio el producto al rubro
			articuloProducto1.setRubroarticuloproducto(rubroArticuloProducto1);
			//asocio el tipo con el producto
			articuloProducto1.setTipoProducto(TipoProducto.COCINA);
			//creo el rubro del ingrediente
			RubroArticuloIngrediente rubroArticuloIngrediente1 = new RubroArticuloIngrediente();
			rubroArticuloIngrediente1.setDenominacion("Verdura");
			rubroArticuloIngrediente1.setFechaAlta(new Date());
			rubroArticuloIngrediente1.setFechaBaja(new Date());
			rubroArticuloIngrediente1.setFechaModificacion(new Date());
			//creo el ingrediente
			ArticuloIngrediente articuloIngrediente1 = new ArticuloIngrediente();
			articuloIngrediente1.setDenominacion("Carne");
			articuloIngrediente1.setPrecioCompra(BigDecimal.valueOf(450));
			articuloIngrediente1.setFechaAlta(new Date());
			articuloIngrediente1.setFechaBaja(new Date());
			articuloIngrediente1.setFechaModificacion(new Date());
			articuloIngrediente1.setStockActual(BigDecimal.valueOf(5248));
			articuloIngrediente1.setStockMinimo(BigDecimal.valueOf(3500));
			articuloIngrediente1.setUrlImagen("");
			//asocio el ingrediente con el rubro
			articuloIngrediente1.setRubroArticuloIngrediente(rubroArticuloIngrediente1);
			//creo UnidadMedida
			UnidadMedida unidadMedida1 = new UnidadMedida();
			unidadMedida1.setAbreviatura("Kg");
			unidadMedida1.setDenominacion("Kilogramos");
			unidadMedida1.setFechaAlta(new Date());
			unidadMedida1.setFechaBaja(new Date());
			unidadMedida1.setFechaModificacion(new Date());
			//asocio unidadMedida con ingrediente
			articuloIngrediente1.setUnidadMedida(unidadMedida1);
			//creo un Domicilio
			Domicilio domicilio1 = new Domicilio();
			domicilio1.setCalle("Olascoaga");
			domicilio1.setNumero(232);
			domicilio1.setCodigoPostal(5504);
			domicilio1.setNumeroDpto(23);
			domicilio1.setPisoDpto(2);
			domicilio1.setFechaAlta(new Date());
			domicilio1.setFechaBaja(new Date());
			domicilio1.setFechaModificacion(new Date());
			//creo un usuario
			Usuario usuario1 = new Usuario();
			usuario1.setUsername("Mei_12");
			usuario1.setRol(Rol.EMPLEADO);
			usuario1.setFechaAlta(new Date());
			usuario1.setFechaBaja(new Date());
			usuario1.setFechaModificacion(new Date());
			usuario1.setAuth0Id("1f89JF81FSA2415G5UUES");
			//asocio el domicilio al usuario
			domicilio1.setUsuario(usuario1);
			//creo una persona
			Persona persona1 = new Persona();
			persona1.setApellido("Castro");
			persona1.setNombre("Melisa");
			persona1.setEmail("mei_castro@gmail.com");
			persona1.setTelefono("2615847293");
			//asocio la persona con el usuario
			usuario1.setPersona(persona1);
			//creo el Pedido
			Pedido pedido1 = new Pedido();
			pedido1.setTotal(BigDecimal.valueOf(2560));
			pedido1.setFechaBaja(new Date());
			pedido1.setFechaAlta(new Date());
			pedido1.setDomicilioEntrega(domicilio1);
			pedido1.setFechaModificacion(new Date());
			pedido1.setFechaPedido(new Date());
			pedido1.setHoraEstimadaFinalizacion(new Date());
			pedido1.setTotalCosto(BigDecimal.valueOf(3255));
			//asocio el pedido con su estado
			pedido1.setEstadoPedido(EstadoPedido.COMPLETADO);
			//asocio el pedido con el tipo de envio
			pedido1.setTipoEnvio(TipoEnvio.DELIVERY);
			//creo el detallePedido
			DetallePedido detallePedido1 = new DetallePedido();
			detallePedido1.setCantidad(3);
			detallePedido1.setSubtotal(BigDecimal.valueOf(2560));
			detallePedido1.setSubtotalCosto(BigDecimal.valueOf(3255));
			//asocio el detalle pedido a articulo producto
			detallePedido1.setArticuloProducto(articuloProducto1);
			//asocio el pedido a detallePedido
			pedido1.agregarDetallePedido(detallePedido1);
			//asocio el pedido al usuario
			pedido1.setUsuario(usuario1);
			//asocio al Pedido su Forma de Pago
			pedido1.setFormaPago(FormaPago.MERCADO_PAGO);
			//creo el estado Pedido Estado
			PedidoEstadoPedido pedidoEstadoPedido1 = new PedidoEstadoPedido();
			pedidoEstadoPedido1.setEstadoPedido(EstadoPedido.COMPLETADO);
			pedidoEstadoPedido1.setFechaHoraCambioEstado(new Date());
			//asocio el EstadoPedidoEstado al pedido
			pedido1.agregarPedidoEstadoPedido(pedidoEstadoPedido1);
			//Creo una compra de Ingrediente
			CompraIngredientes compraIngredientes1 = new CompraIngredientes();
			compraIngredientes1.setCostoTotalCompra(BigDecimal.valueOf(3000));
			compraIngredientes1.setFechaHoraCompraIngredientes(new Date());
			//Creo un DetalleCompraIngrediente
			DetalleCompraIngrediente detalleCompraIngrediente1 = new DetalleCompraIngrediente();
			detalleCompraIngrediente1.setPrecioCompra(BigDecimal.valueOf(1500));
			detalleCompraIngrediente1.setSubTotalCompra(BigDecimal.valueOf(3000));
			detalleCompraIngrediente1.setCantidadComprada(2);
			//asocio la compra con el detalle compra
			compraIngredientes1.agregarDetalleIngrediente(detalleCompraIngrediente1);
			//asocio el detalle al articulo ingrediente
			detalleCompraIngrediente1.setArticuloIngrediente(articuloIngrediente1);
			//creo un detalle articulo manufacturado
			DetalleArticuloManufacturado detalleArticuloManufacturado1 = new DetalleArticuloManufacturado();
			detalleArticuloManufacturado1.setCantidad(BigDecimal.valueOf(90));
			//asocio el detalle articulo manufacturado al articulo
			detalleArticuloManufacturado1.setArticuloIngrediente(articuloIngrediente1);
			//creo factura
			Factura factura1 = new Factura();
			factura1.setFechaFacturacion(new Date());
			factura1.setTotalVenta(BigDecimal.valueOf(5000));
			factura1.setMpPreferenceId("1");
			factura1.setMpPaymentId(Long.valueOf(1));
			factura1.setMpPaymentType("MercadoPago");

			//creo un detalle factura
			DetalleFactura detalleFactura1 = new DetalleFactura();
			detalleFactura1.setSubtotal(BigDecimal.valueOf(1500));
			detalleFactura1.setCantidad(3);
			//asocio el detalle factura al producto
			detalleFactura1.setArticuloProducto(articuloProducto1);
			//asocio la factura con el detalle
			factura1.agregarDetalleFactura(detalleFactura1);
			//asocio el estado factura a la factura
			factura1.setEstadoFactura(EstadoFactura.COBRADO);
			//asocio la forma de pago a la factura
			factura1.setFormaPago(FormaPago.EFECTIVO);
			//asocio la factura al pedido
			factura1.setPedido(pedido1);
			//creo una Nota Credito
			NotaCredito notaCredito1 = new NotaCredito();
			notaCredito1.setTotalImporteCredito(BigDecimal.valueOf(1500));
			notaCredito1.setFechaHoraEmision(new Date());
			notaCredito1.setFechaHoraVencimiento(new Date());
			//creo el detalle de nota crédito
			DetalleNotaCredito detalleNotaCredito1 = new DetalleNotaCredito();
			detalleNotaCredito1.setCantidad(3);
			//asocio el detalle Nota Crédito al producto
			detalleNotaCredito1.setArticuloProducto(articuloProducto1);
			//asocio la nota credito con su detalle
			notaCredito1.agregarDetalleNotaCredito(detalleNotaCredito1);
			//asocio la nota del crédito a la factura
			notaCredito1.setFactura(factura1);

			articuloIngredienteRepository.save(articuloIngrediente1);
			articuloProductoRepository.save(articuloProducto1);
			compraIngredienteRepository.save(compraIngredientes1);
			detalleArticuloManufacturadoRepository.save(detalleArticuloManufacturado1);
			detalleCompraIngredienteRepository.save(detalleCompraIngrediente1);
			detalleFacturaRepository.save(detalleFactura1);
			detalleNotaCreditoRepository.save(detalleNotaCredito1);
			detallePedidoRepository.save(detallePedido1);
			domicilioRepository.save(domicilio1);
			facturaRepository.save(factura1);
			notaCreditoRepository.save(notaCredito1);
			pedidoEstadoPedidoRepository.save(pedidoEstadoPedido1);
			pedidoRepository.save(pedido1);
			personaRepository.save(persona1);
			rubroArticuloIngredienteRepository.save(rubroArticuloIngrediente1);
			rubroArticuloProductoRepository.save(rubroArticuloProducto1);
			unidadMedidaRepository.save(unidadMedida1);
			usuarioRepository.save(usuario1);
		};
	}


}
