import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;


public class Insertion {

	
	
	public void insertTache(int ID,String Description, Date DateDebutTheorique, Date DateFinTheorique  )
	{
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:ProjectMang.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      String sql = "INSERT INTO Tache VALUES ("+ID+","+Description+","+DateDebutTheorique+","+DateFinTheorique+");";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	}
	public void insertProjet(int ID,String description)
	{
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:ProjectMang.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      String sql = "INSERT INTO Projet VALUES ("+ID+","+description+");";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	}
	public void insertPhase(int ID,String description)
		{
			Connection c = null;
		    try {
		      Class.forName("org.sqlite.JDBC");
		      c = DriverManager.getConnection("jdbc:sqlite:ProjectMang.db");
		      Statement stmt = null;
		      stmt = c.createStatement();
		      String sql = "INSERT INTO Phase VALUES ("+ID+","+description+");";
		      stmt.executeUpdate(sql);
		      stmt.close();
		      c.close();
		    } catch ( Exception e ) {
		      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		      System.exit(0);
		    }	    
	}
	
	public void insertSousProjet(int ID,String description)
	{
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:ProjectMang.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      String sql = "INSERT INTO SOUSProjet VALUES ("+ID+","+description+");";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }	    
	   }
	
	public void insertJalon(int ID,String description, Date date)
	{
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:ProjectMang.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      String sql = "INSERT INTO Jalon VALUES ("+ID+","+description+","+date+");";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }	    
	   }
	public void insertRH(int ID,String nom, String prenom,float cout)
	{
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:ProjectMang.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      String sql = "INSERT INTO RH VALUES ("+ID+","+nom+","+prenom+","+cout+");";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }	    
	   }
	public void insertRL(int ID,String nom,String version, float cout)
	{
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:ProjectMang.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      String sql = "INSERT INTO RL VALUES ("+ID+","+nom+","+version+","+cout+");";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }	    
	   }
	public void insertRM(int ID, float cout)
	{
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:ProjectMang.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      String sql = "INSERT INTO RM VALUES ("+ID+","+cout+");";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }	    
	   }
	public void insertLot(int ID)
	{
		Connection c = null;
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:ProjectMang.db");
	      Statement stmt = null;
	      stmt = c.createStatement();
	      String sql = "INSERT INTO Lot VALUES ("+ID+");";
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }	    
	   }
}



