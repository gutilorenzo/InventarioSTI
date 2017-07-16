package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conectar {
	
	private Connection con = null;
	private Statement consulta = null;
	private ResultSet data = null;
	private String server;
	private String BD;
	private String userBD;
	private String passwBD;
	
	
	public Conectar(){
		this.server = "127.0.0.1"; //localhost
		this.BD = "inventario";		//Nombre de la 
		this.userBD = "lorenzo";		//Usuario de la BD
		this.passwBD = "racing2017";	//Password del usuario
		
	}
	//Metodo para abrir conexion
	
	public void con(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver"); //Cargamos el Driver de conexion
			String url = "jdbc:mysql://"+this.server+"/"+this.BD;
			this.con = DriverManager.getConnection(url,this.userBD,this.passwBD);
			System.out.println("Conexion exitosa..ok");
			this.consulta = con.createStatement(); //Inicializamos el objeto Statement para SQL
			
			
			
		}catch (Exception e){
			System.out.println("Error de Conexion "+e.getMessage());		
			
		}
		
	}
	//Metodo para cerrar la conexion
	public void desconectar(){
		try{
			if(con!= null){
				this.con.close();				
			}
			
		}catch(Exception e){
			System.out.println("Error de Desconexion "+e.getMessage());
			
		}
		
	}
	//Metodo para ejecutar SQL Insert Update Delete
	public int excecQuery(String com){
		int res = 0;
		
		try{
			this.con();
			res = this.consulta.executeUpdate(com);			
		}catch (Exception e){
			System.out.println("Error de Ejecucion "+e.getMessage());
			
		}
		
		
		
		return res;
				
	}
	//Metodo para ejecutar SELECT
	
	

}



