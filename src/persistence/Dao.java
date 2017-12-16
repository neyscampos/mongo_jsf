package persistence;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;

public class Dao {
	DB con;
	BasicDBObject stmt;
	DBCursor rs;

	public void open() throws Exception {
		Mongo mongo = new Mongo();
		con = mongo.getDB("bdmongo");
	}
}
