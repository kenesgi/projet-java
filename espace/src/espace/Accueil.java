package espace;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableColumn;



public class Accueil extends JFrame
{    
	//CREATION DES PANELS
    JPanel panOne = new JPanel();
    JPanel panCenter = new JPanel();
    JPanel panest = new JPanel();
    JPanel panconnec = new JPanel();
    
    //CREATION DES BOUTONS
    private JButton jbvalider = new JButton("Se connecter");
    
    
    private JTable MesInfos;
    
    //CREATION DES LABELS
    private JLabel labelinfos = new JLabel("Les Infos", JLabel.CENTER);
    private JLabel ident =	new JLabel("Identifiant");
    private JLabel mdp =	new JLabel("Mot de passe");
    private JLabel baspage =	new JLabel("Copyright   Collaborac'tif 2013", JLabel.CENTER);
    private JLabel ouest =	new JLabel();
    private JLabel est =	new JLabel();
    
    
    //CREATION DES JTF ET PASSWORD
    private JTextField jtfident = new JTextField("");
    private JPasswordField jpfmdp = new JPasswordField("");
    
    //CREATION DU MENU
    private JMenuBar menuBar = new JMenuBar();
    private JMenu Accueil = new JMenu("Accueil");
    private JMenu Profil = new JMenu("Profil");
    private JMenu Documents = new JMenu("Documents");
    private JMenuItem aller = new JMenuItem("Aller");
    private JMenuItem transfert = new JMenuItem("Transfert");
    

    private Color fondBouton = Color.white;
    
    //CONSTRUCTEUR
    public Accueil()
    {
        setName("Accueil");
        setTitle("Accueil");
        initMenubar();
        initPage();
        setVisible(true);
    }

    
    private void initMenubar()
    {

        menuBar.add(Accueil);
        menuBar.add(Profil);
        menuBar.add(Documents);
        setJMenuBar(menuBar);
        setVisible(true);

        Accueil.add(aller);
        Documents.add(transfert);
      
    }
    
    private void initPage()
    {
    	//Conteneur
    	 Container c = getContentPane();
         BorderLayout bl=new BorderLayout();
         
         //panneau qui contient le borderlayout
         panOne.setLayout(bl);
         
         //Infos des Jtables
         Object[][] data = {
        	      {"11/04/2013", "Ouverture d'un nouveau service"},
        	      {"09/03/2013", "Nouveau serveur"},
        	      {"23/02/2013", "réorganisation"},
        	      {"15/02/2013", "nouveaux arrivants"}
        	    };
         
        	 
        	    String  title[] = {"Date", "Titre"};
        	    MesInfos = new JTable(data, title);
        	    
        	   
        	  
        	// déclaration des différentes zones du borderlayout
         c.add(BorderLayout.NORTH, panconnec);
         c.add(BorderLayout.SOUTH, panOne.add(baspage));
         c.add(BorderLayout.CENTER, panOne.add(panCenter));
         c.add(BorderLayout.WEST, panOne.add(ouest));
         c.add(BorderLayout.EAST, panOne.add(est));
         
       
         //utilisation du gridlayout
         panCenter.setLayout(new GridLayout(2,1));
         
         //labels du haut
         panCenter.add(labelinfos);
        // panCenter.add(labelconnec);
         
         //Jtable au centre
         panCenter.add(new JScrollPane(MesInfos));
         
        // panCenter.add(panconnec);
         
        
         // flowlayout au nord
         FlowLayout fl=new FlowLayout();
         panconnec.setLayout(fl);
         panconnec.add(ident);
         jtfident.setPreferredSize(new Dimension(150, 30));
         panconnec.add(jtfident);
         panconnec.add(mdp);
         jpfmdp.setPreferredSize(new Dimension(150, 30));
         panconnec.add(jpfmdp);
         panconnec.add(jbvalider);
         ouest.setPreferredSize(new Dimension(150, 30));
         est.setPreferredSize(new Dimension(150, 30));
        baspage.setPreferredSize(new Dimension(150, 90));
         
         
         
        
         
         //labels du bas
        // panCenter.add(labela);
         //panCenter.add(labelb);
         //panCenter.add(labelc);
         
         //redimensionner la largeur d'une colonne d'un jtable
         TableColumn colinfos;
         for(int i = 0; i < MesInfos.getColumnCount(); i++){
           if(i == 1){
             //On récupère le modèle de la colonne
             colinfos = MesInfos.getColumnModel().getColumn(i);
             //On lui affecte la nouvelle valeur
             colinfos.setPreferredWidth(300);
           }
       
         } 
         
         
  
    pack(); //adapter les composants à la taille de la fenetre
	setVisible(true); //toujours à la fin
	
    }
} 