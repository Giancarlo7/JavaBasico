
package trastienda.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import trastienda.excepcion.DAOExcepcion;
import trastienda.modelo.Carrito;
import trastienda.util.ConexionBD;

public class CarritoDAO extends BaseDAO {
    public Collection<Carrito> buscarPorNombre(String nombre) throws DAOExcepcion {
		System.out.println("CarritoDAO: buscarPorNombre(String nombre)");
		String query = "SELECT rol_nombre, descripcion FROM rol WHERE rol_nombre like ?";
		Collection<Carrito> lista = new ArrayList<Carrito>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, "%" + nombre + "%");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Carrito vo = new Carrito();
				vo.setCodigo(rs.getInt("codigo"));
				vo.setTotal(rs.getDouble("total"));
				lista.add(vo);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return lista;
	}

public void insertar(Carrito vo) throws DAOExcepcion {
		System.out.println("CarritoDAO: insertar(Carrito vo)");
		String query = "INSERT INTO rol(rol_nombre, descripcion) VALUES (?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, vo.getCodigo());
			stmt.setDouble(2, vo.getTotal());
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo insertar");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
	}

	public Carrito obtener(String rolNombre) throws DAOExcepcion {
		System.out.println("CarritoDAO: obtener(String rolNombre)");
		Carrito vo = new Carrito();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			String query = "select rol_nombre, descripcion from rol where rol_nombre=?";
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, rolNombre);
			rs = stmt.executeQuery();
			if (rs.next()) {
				vo.setCodigo(rs.getInt(1));
				vo.setTotal(rs.getDouble(2));
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return vo;
	}

	public void eliminar(String rolNombre) throws DAOExcepcion {
		System.out.println("CarritoDAO: eliminar(String rolNombre)");
		String query = "DELETE FROM rol WHERE rol_nombre=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, rolNombre);
			int i = stmt.executeUpdate();
			if (i != 1) {
throw new SQLException("No se pudo eliminar");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
	}

	public void actualizar(Carrito vo) throws DAOExcepcion {
		System.out.println("CarritoDAO: actualizar(Carrito vo)");
		String query = "update rol set descripcion=? where rol_nombre=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setInt(1, vo.getCodigo());
			stmt.setDouble(2, vo.getTotal());
			int i = stmt.executeUpdate();
			if (i != 1) {
				throw new SQLException("No se pudo actualizar");
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
	}
public Collection<Carrito> listar() throws DAOExcepcion {
		System.out.println("CarritoDAO: listar()");
		Collection<Carrito> c = new ArrayList<Carrito>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			String query = "SELECT rol_nombre,descripcion from rol";
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Carrito vo = new Carrito();
				vo.setCodigo(rs.getInt("rol_nombre"));
				vo.setTotal(rs.getDouble("descripcion"));
				c.add(vo);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			throw new DAOExcepcion(e.getMessage());
		} finally {
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		return c;
	}

}

