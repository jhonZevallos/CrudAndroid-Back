package idat.com.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {
	
	@Id
	private int id_producto;
	private String nombreProducto;
	private String categoria;
	private int cantidad;
	
	public Producto() {
		super();
	}

	public Producto(int id_producto, String nombreProducto, String categoria, int cantidad) {
		super();
		this.id_producto = id_producto;
		this.nombreProducto = nombreProducto;
		this.categoria = categoria;
		this.cantidad = cantidad;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
