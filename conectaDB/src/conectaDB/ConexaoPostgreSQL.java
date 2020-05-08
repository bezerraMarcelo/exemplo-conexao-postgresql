package conectaDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConexaoPostgreSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio PostgreSQLMySQL");
		
		try {

			Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/teste", "postgres", "root");
			
			PreparedStatement pstm = conexao.prepareStatement("SELECT nome FROM cliente");
	 
			ResultSet rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.println("Nome do Cliente: " + rs.getString("nome"));				
			}
			rs.close();
			pstm.close();
			conexao.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Fim PostgreSQLMySQL");

	}

}
