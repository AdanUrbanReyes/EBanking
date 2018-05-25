package model.database.dao.interfaces;

import java.util.ArrayList;

public interface CRUD <T>{
	
	public boolean create(T object);
	public ArrayList<T> read(T object);
	public ArrayList<T> read();
	public boolean update(T object);
	public boolean delete(T object);

}
