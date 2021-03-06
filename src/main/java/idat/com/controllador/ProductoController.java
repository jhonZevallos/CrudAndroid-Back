package idat.com.controllador;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import idat.com.modelo.Producto;
import idat.com.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	ProductoService service;
	
	@GetMapping("/listar")
	public List<Map<String,Object>>listar(Model model){
		return service.listar();
	}
	
	@PostMapping("/agregar")
	public String save(@RequestBody Producto p,Model	model) {
		int id=service.add(p);
		if(id==0) {
			return "No se pudo registrar";
		}else {
		return "El registro se realizo con exito";
		}
		}
	
	//copiar agregar
	@PostMapping("/actualizar/{id}")
	public String save(@RequestBody Producto p,@PathVariable int id,Model model) {
		p.setId_producto(id);
		int r=service.edit(p);
		if(r==0) {
			return "No se pudo actualizar";
		}else {
		return "Se actualizo con exito";
		}
		}
	
	//eliminar
	@PostMapping("/eliminar/{id}")
	public String delete(@PathVariable int id,Model model) {
		int r=service.delete(id);
		if(r==0) {
		  return "Registro no Eliminado";
		}else {
		  return "Registro Eliminado";
		}
		}
}
