
package trastienda.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import trastienda.excepcion.DAOExcepcion;
import trastienda.modelo.Rol;
import trastienda.util.ConexionBD;

public class RolDAO extends BaseDAO {

	public Collection<Rol> buscarPorNombre(String nombre) throws DAOExcepcion {
		System.out.println("RolDAO: buscarPorNombre(String nombre)");
		String query = "SELECT rol_nombre, descripcion FROM rol WHERE rol_nombre like ?";
		Collection<Rol> lista = new ArrayList<Rol>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, "%" + nombre + "%");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Rol vo = new Rol();
				vo.setRolNombre(rs.getString("rol_nombre"));
				vo.setDescripcion(rs.getString("descripcion"));
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

public void insertar(Rol vo) throws DAOExcepcion {
		System.out.println("RolDAO: insertar(Rol vo)");
		String query = "INSERT INTO rol(rol_nombre, descripcion) VALUES (?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, vo.getRolNombre());
			stmt.setString(2, vo.getDescripcion());
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

	public Rol obtener(String rolNombre) throws DAOExcepcion {
		System.out.println("RolDAO: obtener(String rolNombre)");
		Rol vo = new Rol();
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
				vo.setRolNombre(rs.getString(1));
				vo.setDescripcion(rs.getString(2));
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
		System.out.println("RolDAO: eliminar(String rolNombre)");
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

	public void actualizar(Rol vo) throws DAOExcepcion {
		System.out.println("RolDAO: actualizar(Rol vo)");
		String query = "update rol set descripcion=? where rol_nombre=?";
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = ConexionBD.obtenerConexion();
			stmt = con.prepareStatement(query);
			stmt.setString(1, vo.getDescripcion());
			stmt.setString(2, vo.getRolNombre());
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
public Collection<Rol> listar() throws DAOExcepcion {
		System.out.println("RolDAO: listar()");
		Collection<Rol> c = new ArrayList<Rol>();
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = ConexionBD.obtenerConexion();
			String query = "SELECT rol_nombre,descripcion from rol";
			stmt = con.prepareStatement(query);
			rs = stmt.executeQuery();
			while (rs.next()) {
				Rol vo = new Rol();
				vo.setRolNombre(rs.getString("rol_nombre"));
				vo.setDescripcion(rs.getString("descripcion"));
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

