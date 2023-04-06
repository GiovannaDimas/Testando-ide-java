package br.com.dio;

import java.util.Objects;

public class Teste_Gato {
	
	private String nome;
	private String cor;
	private Integer idade;
	
	public Teste_Gato() {}

	public Teste_Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
	
	/*public Gato(String nome, String cor, Integer idade) {
	this.nome = nome;
	this.cor = cor;
	this.idade = idade;
}
	 ***** comentado o teste feito na mão, logo acima um teste pressionando CTRL+3 e adicionando
	 Construct*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teste_Gato other = (Teste_Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Teste_Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}	
}
