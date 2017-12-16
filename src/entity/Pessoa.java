package entity;

import java.io.Serializable;

public class Pessoa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Object _id;
	private Double id;
	private String nome;
	private String email;
	private Double idade;
	
	public Pessoa(Double id, String nome, String email, Double idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	public Pessoa() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
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
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", idade=" + idade + "]";
	}
	public Object get_id() {
		return _id;
	}
	public void set_id(Object _id) {
		this._id = _id;
	}
	public void setId(Double id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setIdade(Double idade) {
		this.idade = idade;
	}
	public Double getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public Double getIdade() {
		return idade;
	}
	
	
}
