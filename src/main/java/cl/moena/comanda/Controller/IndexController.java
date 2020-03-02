package cl.moena.comanda.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.moena.comanda.Model.Estado;
import cl.moena.comanda.Model.Orden;
import cl.moena.comanda.Model.OrdenProducto;
import cl.moena.comanda.Model.Producto;
import cl.moena.comanda.Model.Tipo;
import cl.moena.comanda.Model.TipoPago;
import cl.moena.comanda.Service.EstadoService;
import cl.moena.comanda.Service.OrdenProductoService;
import cl.moena.comanda.Service.OrdenService;
import cl.moena.comanda.Service.ProductoService;
import cl.moena.comanda.Service.TipoPagoService;
import cl.moena.comanda.Service.TipoService;

@RestController
public class IndexController {

	@Autowired
	TipoService tipoService;
	@Autowired
	TipoPagoService tipoPagoService;
	@Autowired
	ProductoService productoService;
	@Autowired
	OrdenService ordenService;
	@Autowired
	OrdenProductoService ordenProductoService;
	@Autowired
	EstadoService estadoService;
	
	@GetMapping("/index")
	public String index() {
		return "Hola Mundo, desde comanda ;)";
	}
	
	@PostMapping("/indexTipo")
	public Tipo indexTipo(
			@RequestBody (required = true) Tipo objeto) {
		
		return tipoService.postTipo(objeto);
	}
	
	@GetMapping("/indexTipo")
	public List<Tipo> indexTipo() {
		
		return tipoService.get();
	}
	
	@PostMapping("/indexTipoPago")
	public TipoPago indexTipoPago(
			@RequestBody (required = true) TipoPago objeto) {
		
		return tipoPagoService.post(objeto);
	}
	
	@GetMapping("/indexTipoPago")
	public List<TipoPago> indexTipoPago() {
		
		return tipoPagoService.get();
	}
	
	@PostMapping("/indexProducto")
	public Producto indexProducto(
			@RequestBody (required = true) Producto objeto) {
		
		return productoService.post(objeto);
	}
	
	@GetMapping("/indexProducto")
	public List<Producto> indexProducto() {
		
		return productoService.get();
	}
	
	@PostMapping("/indexOrden")
	public Orden indexOrden(
			@RequestBody (required = true) Orden objeto) {
		
		return ordenService.post(objeto);
	}
	
	@GetMapping("/indexOrden")
	public List<Orden> indexOrden() {
		
		return ordenService.get();
	}
	
	@PostMapping("/indexOrdenProducto")
	public OrdenProducto indexOrdenProducto(
			@RequestBody (required = true) OrdenProducto objeto) {
		
		return ordenProductoService.post(objeto);
	}
	
	@GetMapping("/indexOrdenProducto")
	public List<OrdenProducto> indexOrdenProducto() {
		
		return ordenProductoService.get();
	}
	
	@PostMapping("/indexEstado")
	public Estado indexEstado(
			@RequestBody (required = true) Estado objeto) {
		
		return estadoService.post(objeto);
	}
	
	@GetMapping("/indexEstado")
	public List<Estado> indexEstado() {
		
		return estadoService.get();
	}
	
}
