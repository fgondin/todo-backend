package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	
	public static String status = "Desconectado...";
	
	public static Connection getConexao() {
		Connection cnx = null;
		
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driverName);
			
			String serverName = "localhost:3306";
			String dataBase = "tarefas_db";
			String url = "jdbc:mysql://" + serverName + "/" + dataBase;
			String user = "root";
			String password = "";
			
			cnx = DriverManager.getConnection(url, user, password);
			
			if(cnx != null) {
				status = "STATUS ---> Conectado com sucesso!  ;D";
			} else {
				status = "STATUS ---> Não foi possivel realizar a conexão D:";
			}
				
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnx;
	}
	
	public static String getStatusConexao(){
		return status;
	}
	
	public static boolean setFecharConexao() {
		try {
			Dao.getConexao().close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

}