package manager;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import entity.Pessoa;
import persistence.PessoaDao;

public class BeanManager implements Serializable {

	private static final long serialVersionUID = 1L;
	private Pessoa pessoa;
	private List<Pessoa> pessoas;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public BeanManager() {
		pessoa = new Pessoa();
	}

	public void gravar() {
		FacesContext fc = FacesContext.getCurrentInstance();
		try {
			new PessoaDao().create(pessoa);
			pessoa = new Pessoa();
			fc.addMessage(null, new FacesMessage("Dados Gravados..."));
		} catch (Exception ex) {
			fc.addMessage(null, new FacesMessage("Error: " + ex.getMessage()));
		}
	}

}
