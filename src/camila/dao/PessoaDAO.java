package camila.dao;
import java.util.ArrayList;

import camila.entidade.*;

public interface PessoaDAO {
	
	public boolean inserirPessoa (Pessoa pessoa);
	
	public boolean deletarPessoa (Pessoa pessoa);
	
	public boolean retornarPessoa (Pessoa pessoa);
	
	public boolean retornarTodos (ArrayList <Pessoa> listaPessoas);
	
	public boolean alterarPessoa (Pessoa pessoaAntiga, Pessoa pessoaNova);
	
}
