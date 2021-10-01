package idat.com.modeloDAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import idat.com.interfaces.ProductoInterface;
import idat.com.modelo.Producto;

@Repository
public class ProductoDAO implements ProductoInterface{

	@Autowired
	JdbcTemplate template;
	
	@Override
	public List<Map<String, Object>> listar() {
		List<Map<String,Object>>lista=template.queryForList("select	* from productos");
		return lista;
	}

	@Override
	public List<Map<String, Object>> listar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Producto p) {
		String sql="insert into productos(nombreProducto,categoria,cantidad)values(?,?,?)";
		
		return template.update(sql,p.getNombreProducto(),p.getCategoria(),p.getCantidad());
	}

	@Override
	public int edit(Producto p) {
		String sql="update productos set nombreProducto=?,categoria=?,cantidad=? where id=?";
		
		return template.update(sql,p.getNombreProducto(),p.getCategoria(),p.getCantidad(),p.getId_producto());
	}

	@Override
	public int delete(int id_producto) {
		String sql="delete from productos where id=?";

		return template.update(sql,id_producto); 
		
	}

}
