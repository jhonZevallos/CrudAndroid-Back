package idat.com.interfaces;

import java.util.List;
import java.util.Map;

import idat.com.modelo.Producto;

public interface ProductoInterface {
	public List<Map<String,Object>>listar();
	public List<Map<String,Object>>listar(int id);
	public int add (Producto p);
	public int edit(Producto p);
	public int delete(int id_producto);
	
}
