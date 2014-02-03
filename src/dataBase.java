import java.sql.*;
import java.util.Date;

public class dataBase
{
  public dataBase()
  {
    Connection c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:test2.db");
      Statement stmt = null;
      stmt = c.createStatement();
      String sql = "CREATE TABLE Tache " +
                   "(Description varchar2(50) PRIMARY KEY   NOT NULL," +
                   " DatedebutTheorique   varchar2(20) , " +
                   " DateFinTheorique   varchar2(20) , " +
                   " DateDebutReelle Date , " + 
                   " DateFinReelle   Date " +
                   ")"; 
      
      String	sql1="CREATE TABLE Projet"+
      			"(Description varchar2(50) PRIMARY KEY )";
      stmt.executeUpdate(sql);
      stmt.executeUpdate(sql1);
      		sql="CREATE TABLE SousProjet"+
      			"(Description varchar2(50) PRIMARY KEY )";
      stmt.executeUpdate(sql);
      		sql="CREATE TABLE Jalon"+
    			"(Description varchar2(50) PRIMARY KEY,"+
      			"Date Date )";
      stmt.executeUpdate(sql);
      		sql="CREATE TABLE Phase"+
  			"(Description varchar2(50) PRIMARY KEY )";
      stmt.executeUpdate(sql);
      sql="CREATE TABLE RH"+
    			"(ID number(5) PRIMARY KEY ," +
    			"nom varchar2(30),"+
    			"prenom varchar2(30),"+
    			"Cout real )";
      stmt.executeUpdate(sql);
      sql="CREATE TABLE RL"+
    			"(ID number(5) PRIMARY KEY ," +
    			"nom varchar2(30),"+
    			"version varchar2(10),"+
    			"Cout real )";
      stmt.executeUpdate(sql);
      sql="CREATE TABLE RM"+
    			"(ID number(5) PRIMARY KEY ," +
    			"Cout real )";
      stmt.executeUpdate(sql);
      sql="CREATE TABLE Lot "+
    			"(ID number(5) PRIMARY KEY )";
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
    System.out.println("Opened database successfully");
  }

  public void insertTache(String Description, String DateDebutTheorique, String DateFinTheorique  )
	{
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:test2.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      String sql = "INSERT INTO Tache (Description,DatedebutTheorique,DateFinTheorique) VALUES ('"+Description+"','"+DateDebutTheorique+"','"+DateFinTheorique+"');";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	}
  public void insertProjet(String description)
	{
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:test2.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      String sql = "INSERT INTO Projet VALUES ("+description+");";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	}
  public String selectTache(String id)
  {
	  Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:test2.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      
	      
	      ResultSet rs =  stmt.executeQuery("SELECT * FROM Tache;");
	      String Desc =rs.getString("description");
	      
	      stmt.close();
	      c.close();
	      return Desc;
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	      
	    }
	  return "aaa";
  }
  
  public String selectProjet()
  {
	  Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:test2.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      
	      
	      ResultSet rs =  stmt.executeQuery("SELECT * FROM Tache WHERE id=1;");
	      String Desc =rs.getString("description");
	      
	      stmt.close();
	      c.close();
	      return Desc;
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	      
	    }
	  return "aaa";
  }
  }

