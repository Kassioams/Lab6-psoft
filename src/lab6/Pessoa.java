package lab6;

import classesState.EstadoVacinacao;
import classesState.NaoVacinada;

public class Pessoa {
	private String nome;

	private String cpf;

	private String endereco;

	private String cartaoSUS;

	private String email;

	private String telefone;

	private String profissao;

	private String comorbidade;

	private int idade;

	private EstadoVacinacao estado;

	public Pessoa(String nome, String cpf, String endereco, String cartaoSUS, String email, String telefone,
			String profissao, String comorbidade, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cartaoSUS = cartaoSUS;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.comorbidade = comorbidade;
		this.idade = idade;
		this.estado = new NaoVacinada();

	}

	public void atualizaEstadoVacina(Pessoa pessoa) {
		estado.alteraEstado(pessoa);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCartaoSUS() {
		return cartaoSUS;
	}

	public void setCartaoSUS(String cartaoSUS) {
		this.cartaoSUS = cartaoSUS;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getComorbidade() {
		return comorbidade;
	}

	public void setComorbidade(String comorbidade) {
		this.comorbidade = comorbidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public EstadoVacinacao getSituacao() {
		return estado;
	}

	public void setEstadoVacinacao(EstadoVacinacao estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", cartaoSUS=" + cartaoSUS
				+ ", email=" + email + ", telefone=" + telefone + ", profissao=" + profissao + ", comorbidade="
				+ comorbidade + ", idade=" + idade + ", estado=" + estado + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
}
