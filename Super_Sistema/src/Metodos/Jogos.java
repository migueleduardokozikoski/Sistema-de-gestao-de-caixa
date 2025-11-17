package Metodos;

public class Jogos {
	private String nome;
	private String genero;
	private double preco;
	
	public Jogos() {
		
	}
	
	public Jogos ( String nome, String genero,double preco) {
		setNome(nome);
		setGenero(genero);
		setPreco(preco);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome=nome;
		}
	}
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		if (genero != null && !genero.isBlank()) {
			this.genero=genero;
		}
	}
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco=preco;
		}
	}
	public void mostrarResumo() {
		System.out.printf("Nome do jogo: %s ,Genero do jogo:%s, Preço:%.2f\n",nome,genero,preco);
	}

	@Override
	public String toString() {
		return "Jogos [nome=" + nome + ", genero=" + genero + ", preco=" + preco + "]";
	}
	
	
	
}
