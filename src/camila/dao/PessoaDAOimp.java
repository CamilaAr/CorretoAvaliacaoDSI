package camila.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import camila.conexao.Conexao;
import camila.entidade.*;


public class PessoaDAOimp implements PessoaDAO {

	@Override
	public boolean inserirPessoa(Pessoa pessoa) {
		// TODO Auto-generated method stub
               
	
		Connection connection = Conexao.getConnection();
		
		String query = "INSERT INTO pessoa (nome, idade) VALUES (?, ?)";
		try {
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setString(1, pessoa.getNome());
                int idade = pessoa.getIdade();
                String id = String.valueOf(idade);
                stmt.setString(2, id);
		stmt.execute();
		stmt.close();
		
		
		connection.close();
		
		
		
		System.out.println("INSERIDO");
		
		
		
		} catch (SQLException e){
			System.out.println("NAO INSERIDO");
                        System.out.println(e);
			try {
				connection.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
		return false;

		
		
		
		}
	
	@Override
	public boolean deletarPessoa (Pessoa pessoa) {
		Connection connection = Conexao.getConnection();
		
		
		String query = "Delete from pessoa where nome = ?";
		try {
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setString(1, pessoa.getNome());
		stmt.execute();
		stmt.close();
		
		
		System.out.println("DELETADO");
		connection.close();
		
		}
		
		catch (SQLException e){
			System.out.println("NAO DELETADO");
			try {
				connection.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
		
		
		
		return false;
		
	}
	
	
	
	public boolean retornarPessoa (Pessoa pessoa) {
		
Connection connection = Conexao.getConnection();
		
		
		String query = "SELECT nome FROM  dsi WHERE nome = ?";
		
		
		try {
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setString(1, pessoa.getNome());
		
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
		pessoa.setNome(rs.getString("nome"));
		System.out.println(rs.getString("nome"));
		}
		
		
		
		
		rs.close();
		stmt.close();
		connection.close();
		
		
		System.out.println("RETORNADO");
		
		
		}
		
		catch (SQLException e){
			System.out.println("NAO RETORNADO");
			e.printStackTrace();
			try {
				connection.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}
		
		return false;
	}
	
	
	
	
	
	
			
	
	
	
	public boolean alterarPessoa (Pessoa pessoaAntiga, Pessoa pessoaNova) {
		
		Connection connection = Conexao.getConnection();
				
				
				String query = "UPDATE pessoa SET nome = ?, idade = ? WHERE nome = ?";
				
				
				try {
					PreparedStatement stmt = connection.prepareStatement(query);
					stmt.setString(3, pessoaAntiga.getNome());
                                         int idade = pessoaNova.getIdade();
                                          String id = String.valueOf(idade);
					stmt.setString(1, pessoaNova.getNome());
                                        stmt.setString(2, id);
					stmt.execute();
					stmt.close();
					
					
					System.out.println("ALTERADO");
					connection.close();
					
					}
					
					catch (SQLException e){
						System.out.println("NAO ALTERADO");
						e.printStackTrace();
						try {
							connection.close();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
					
				
				}
				
				return false;
			}
	
	
public boolean retornarTodos (ArrayList <Pessoa> listaPessoas) {
		
		Connection connection = Conexao.getConnection();
		

		
		try {
			
			
			
			String query = "SELECT * FROM pessoa";
			
			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();;
			
			while(rs.next()) {
				
				Pessoa p = new Pessoa();
				
				p.setNome(rs.getString("nome"));
                                int idade = Integer.parseInt(rs.getString("idade"));
                                p.setIdade(idade);
				
				System.out.println("Nome: "+ rs.getString("nome") + " id: "+ rs.getString("id")+ " idade: "+ idade);
				
				
				
				listaPessoas.add(p);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
			
		return false;
	}
	
	

}
