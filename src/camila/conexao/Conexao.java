package camila.conexao;

import java.sql.*;

public class Conexao {
	public static Connection getConnection() {

		
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/dsi","root", "" );
		}
		
		catch (SQLException e ){
			
			throw new RuntimeException (e);
			
		}
		
		
	}
}
