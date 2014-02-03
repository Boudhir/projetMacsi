import interfaces.NewJFrame;
import interfaces.NouveauProjet;

import java.awt.Component;
import java.sql.*;

import javax.swing.tree.DefaultMutableTreeNode;

import org.sqlite.SQLiteDataSource;
public class test {

	
	public static void main(final String[] args) {
		dataBase DB= new dataBase();
		DB.insertProjet("developpement");
		DB.insertProjet("projetkineket ");
		DB.insertProjet("projetnao");
		String res=DB.selectProjet();
		DefaultMutableTreeNode nouveau = 
		         new DefaultMutableTreeNode(res);
	
	 NewJFrame p= new NewJFrame();
		p.setVisible(true);
		

		
	}
}
