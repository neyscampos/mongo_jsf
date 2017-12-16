Projeto demonstração de acesso ao banco Mongo;

use bdmongo;

registro1 = {"id" : 1, "nome" : "luis", "email" : "luis@gmail.com", "idade" : 30 };
registro2 = {"id" : 1, "nome" : "lu", "email" : "lu@gmail.com", "idade" : 29 };
registro3 = {"id" : 1, "nome" : "minimin", "email" : "minimin@gmail.com", "idade" : 40 };
registro4 = {"id" : 1, "nome" : "natalia", "email" : "natalia@gmail.com", "idade" : 35 };
registro5 = {"id" : 1, "nome" : "carlos", "email" : "carlos@gmail.com", "idade" : 39 };

db.pessoa.insert(registro1);
db.pessoa.insert(registro2);
db.pessoa.insert(registro3);
db.pessoa.insert(registro4);
db.pessoa.insert(registro5);

db.pessoa.find(); equivalente ao select *
db.pessoa.find().pretty(); equivalente ao select * identado o json
show collections; demonstra as tabelas 

var consulta = db.pessoa.find(); 
while(consulta.hasNext()){
	var registro = consulta.next();
	printjson(' Nome --> ' + registro.nome);
}

db.pessoa.find().sort({nome : 1}).pretty();


db.pessoa.find({nome : /^n/}).pretty(); -- busca no início a letra
db.pessoa.find({nome : /n$/}).pretty(); -- busca no fim a letra

db.pessoa.find({idade  :{$lt:20}}).pretty(); condição menor que
db.pessoa.find({idade  :{$gt:20}}).pretty(); condição maior que

db.pessoa.find({ $or : [{nome:'lu'}, {nome:'natalia'}]});

