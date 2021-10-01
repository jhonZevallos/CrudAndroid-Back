package idat.com.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.interfaces.ProductoInterface;
import idat.com.modelo.Producto;
import idat.com.modeloDAO.ProductoDAO;

@Service
public class ProductoService implements ProductoInterface{

	@Autowired
	ProductoDAO dao;
	
	@Override
	public List<Map<String, Object>> listar() {
		
		return dao.listar();
	}

	@Override
	public List<Map<String, Object>> listar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Producto p) {
		// TODO Auto-generated method stub
		return dao.add(p);
	}

	@Override
	public int edit(Producto p) {
		// TODO Auto-generated method stub
		return dao.edit(p);
	}

	@Override
	public int delete(int id_producto) {
		// TODO Auto-generated method stub
		return dao.delete(id_producto);
	}

}
