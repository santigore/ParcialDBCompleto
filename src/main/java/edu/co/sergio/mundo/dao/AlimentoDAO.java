package edu.co.sergio.mundo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import edu.co.sergio.mundo.vo.Alimento;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Isabel-Fabian
 * @since 12/08/2015
 * @version 2
 * Clase que permite la gestion de la tabla Depto en la base de datos.
 * 
 * CREATE TABLE Depto(
 *     id_depto integer,
 *     nom_depto varchar(40),
 *     PRIMARY KEY(id_depto)
 * );
 */
 

public class AlimentoDAO implements IBaseDatos<Alimento> {

	/**
	 * Funcion que permite obtener una lista de los departamentos existentes en la base de datos
	 * @return List<Departamento> Retorna la lista de Departamentos existentes en la base de datos
	 */
	public List<Alimento> findAll() {
		List<Alimento> obras= null;
	    String query = "select idcolmena, sum(panalconalimento) as Suma from visitatecnica group by idcolmena;";
	    Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(AlimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    try {
	    Statement st = connection.createStatement();
	    ResultSet rs = st.executeQuery(query);
	    int idColmena;
            int valor;
	
	    while (rs.next()){
                Alimento registro=new Alimento();
	    	if(obras == null){
	    		obras= new ArrayList<Alimento>();     
	    	}
                idColmena=rs.getInt("idColmena");
                registro.setIdColmena(idColmena);
                valor=rs.getInt("suma");
                registro.setAlimento(valor);
	        obras.add(registro);
	    }
	    st.close();
	    
	    } catch (SQLException e) {
			System.out.println("Problemas al obtener la lista de Departamentos");
			e.printStackTrace();
		}
	    
	    return obras;
	}

	
	/**
	 * Funcion que permite realizar la insercion de un nuevo registro en la tabla Departamento
	 * @param Departamento recibe un objeto de tipo Departamento 
	 * @return boolean retorna true si la operacion de insercion es exitosa.
	 */
	public boolean insert(Alimento t) {/*
		boolean result=false;
		Connection connection=null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(ObraDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	    String query = " insert into Obra (nombreAutor,nombreObra,descripcion,estilo,valor)"  + " values (?,?,?,?,?)";
        PreparedStatement preparedStmt=null;
	    try {
			preparedStmt = connection.prepareStatement(query);
			preparedStmt.setString(1, t.getNombreAutor());
                        preparedStmt.setString (2, t.getNombreObra());
                        preparedStmt.setString (3, t.getDescripcion());
                        preparedStmt.setString (4, t.getEstilo());
                        preparedStmt.setDouble(5, t.getValor());
			result= preparedStmt.execute();
	    } catch (SQLException e) {
			e.printStackTrace();
		}*/
		return false;
	}

	/**
	 * Funcion que permite realizar la actualizacion de un nuevo registro en la tabla Departamento
	 * @param Departamento recibe un objeto de tipo Departamento 
	 * @return boolean retorna true si la operacion de actualizacion es exitosa.
	 */
	public boolean update(Alimento t) {
		boolean result=false;
		Connection connection= null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(AlimentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
		String query = "update Obra set nom_depto = ? where id_depto = ?";
		PreparedStatement preparedStmt=null;
		/*try {
		    preparedStmt = connection.prepareStatement(query);
		    preparedStmt.setString(1, t.getNom_departamento());
                    preparedStmt.setInt   (2, t.getId_departamento());
		    if (preparedStmt.executeUpdate() > 0){
		    	result=true;
		    }
			    
		} catch (SQLException e) {
				e.printStackTrace();
		}*/
			
		return result;
	}

	/**
	 * Funcion que permite realizar la eliminario de registro en la tabla Departamento
	 * @param Departamento recibe un objeto de tipo Departamento 
	 * @return boolean retorna true si la operacion de borrado es exitosa.
	 */
	public boolean delete(Alimento t) {/*
	   boolean result=false;
	   Connection connection = null;
            try {
                connection = Conexion.getConnection();
            } catch (URISyntaxException ex) {
                Logger.getLogger(ObraDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
	   String query = "delete from Obra where nombreObra = ?";
	   PreparedStatement preparedStmt=null;
	   try {
		     preparedStmt = connection.prepareStatement(query);
		     preparedStmt.setString(1, t.getIdColmena());
		    result= preparedStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   */
	   return false;
	}
}
