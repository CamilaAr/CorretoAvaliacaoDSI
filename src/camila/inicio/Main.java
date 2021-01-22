package camila.inicio;

import camila.dao.PessoaDAO;
import camila.dao.PessoaDAOimp;
import camila.entidade.Pessoa;
import camila.view.TelaInicial;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 Pessoa pessoa = new Pessoa("Duda", 23);
                 Pessoa pessoa2 = new Pessoa("fefe", 5);
                 PessoaDAOimp dao = new PessoaDAOimp();
		//dao.alterarPessoa(pessoa, pessoa2);
                
               // ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
                
               // dao.retornarTodos(listaPessoas);
                
               //  System.out.println("---------------------");
                
               // for (Pessoa contador : listaPessoas) {
               //    System.out.println(contador.getNome());
               // System.out.println(contador.getIdade());
              //  }
		
		new TelaInicial().setVisible(true);
             

	}

}
