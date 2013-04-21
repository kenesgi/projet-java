package espace;

import javax.swing.SwingUtilities;

public class Application {
	
	public static void main (String[] args ){
		//new Appli();
		Runnable r= new Runnable(){
			public void run(){
				new Accueil();
			}
		};
		SwingUtilities.invokeLater(r);
		
	}
}
