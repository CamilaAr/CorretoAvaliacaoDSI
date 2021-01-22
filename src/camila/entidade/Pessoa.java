package camila.entidade;

public class Pessoa {
	
	private String nome;
        private int idade;
        private int id;
	
	public Pessoa (String nome, int idade) {
		this.nome = nome;
                this.idade = idade;
	}

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
	
	public Pessoa () {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
