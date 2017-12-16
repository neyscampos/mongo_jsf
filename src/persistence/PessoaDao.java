package persistence;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

import entity.Pessoa;

public class PessoaDao extends Dao {

	private DBCollection tabela;

	public void create(Pessoa p) throws Exception {
		open();
		tabela = con.getCollection("pessoa");
		stmt = new BasicDBObject();
		stmt.put("id", p.getId());
		stmt.put("nome", p.getNome());
		stmt.put("email", p.getEmail());
		stmt.put("idade", p.getIdade());
		tabela.insert(stmt);
	}

	public List<Pessoa> findAll() throws Exception {
		open();
		tabela = con.getCollection("pessoa");
		rs = tabela.find(stmt);
		List<Pessoa> lista = new ArrayList<Pessoa>();

		while (rs.hasNext()) {
			DBObject registro = rs.next();
			lista.add(new Pessoa((Double) registro.get("id"), (String) registro.get("nome"),
					(String) registro.get("email"), (Double) registro.get("idade")));
		}
		return lista;
	}
}
