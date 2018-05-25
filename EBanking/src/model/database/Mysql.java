package model.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mysql {
    private static final Logger LOG = Logger.getLogger(Mysql.class.getName());
	
	private String server="127.0.0.1";
    private String user="root";
    private String password="root";
    private String dataBase="ebanking";
    private Connection connection;
    private ResultSet response;
    private PreparedStatement query;
    
    public Mysql(){
        try{
            Class.forName("com.mysql.jdbc.Driver");        
            connection=DriverManager.getConnection("jdbc:mysql://"+server+"/" + dataBase,user,password);
        }catch(ClassNotFoundException cnfe){
            LOG.log(Level.WARNING, "ClassNotFountException at connection to MYSQL " + cnfe.toString() );
        }catch(SQLException sqle){
        	LOG.log(Level.WARNING, "SQLException at connection to MYSQL " + sqle.toString() );
        }
    }
    
    public boolean update(String update){
        try{
            query=connection.prepareStatement(update);
            query.executeUpdate();
            return true;
        }catch(SQLException sqle){
        	LOG.log(Level.WARNING, "SQLException at executing update in MYSQL " + sqle.toString() );
        }
        return false;
    }
    
    public ResultSet query(String query){
        try{
            this.query=connection.prepareStatement(query);
            response=this.query.executeQuery();
        }catch(SQLException sqle){
        	LOG.log(Level.WARNING, "SQLException at executing query in MYSQL " + sqle.toString() );
            return null;
        }
        return response;
    }
    
    public void desconnection(){
        try{
            if(query!=null)
                query.close();
            if(response!=null)
                response.close();
            if(connection!=null)
                connection.close();
//            System.out.print("\n the connection close succefull");
        }catch(SQLException sqle){
        	LOG.log(Level.WARNING, "SQLException at closing MYSQL " + sqle.toString() );
        }
    }
}