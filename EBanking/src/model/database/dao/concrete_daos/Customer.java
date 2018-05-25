package model.database.dao.concrete_daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.database.Mysql;
import model.database.dao.interfaces.CRUD;

public class Customer implements CRUD<model.Customer>{

	private Mysql mysql;
	
	public Customer() {
		mysql = new Mysql();
	}
	
	private model.Customer getCustomer(ResultSet customer) throws SQLException{
		return new model.Customer(customer.getInt("id"), customer.getString("full_name"), customer.getDate("birthday").toLocalDate(), customer.getString("rfc"));
	}
	
	@Override
	public boolean create(model.Customer object) {
		return false;
	}

	@Override
	public ArrayList<model.Customer> read(model.Customer object) {
		return null;
	}

	@Override
	public ArrayList<model.Customer> read() {
        ArrayList<model.Customer> list = new ArrayList<>();
        ResultSet response = mysql.query("SELECT * FROM customer");
        try{
            while(response.next()){       	
                list.add(getCustomer(response));
            }
        }catch(SQLException sqle){
            System.out.print("\nerror gettin all products "+sqle.toString());
        }
        mysql.desconnection();
        return list;
	}

	@Override
	public boolean update(model.Customer object) {
		return false;
	}

	@Override
	public boolean delete(model.Customer object) {
		return false;
	}

}
