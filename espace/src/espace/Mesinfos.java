package espace;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import espace.Menu.BoutonListener;

public class Mesinfos extends JFrame {

    JPanel panOne = new JPanel();
 
    
    //CREATION DES BOUTONS
    private JButton boutonConnexion = new JButton("Connexion");
    private JButton boutonMesInfos = new JButton("Mes Infos");
    private JButton boutonMentionsLegales = new JButton("Mentions légales");
    
    //CREATION DU MENU
    private JMenuBar menuBar = new JMenuBar();
    private JMenu Accueil = new JMenu("Accueil");
    private JMenu Profil = new JMenu("Profil");
    private JMenu Documents = new JMenu("Documents");
    private JMenuItem aller = new JMenuItem("Aller");
    private JMenuItem transfert = new JMenuItem("Transfert");
    
    //Création de notre barre d'outils
    private JToolBar toolBar = new JToolBar();
    
    //Les boutons de la barre d'outils
    private JButton   play = new JButton(new ImageIcon("images/play.jpg")),
    cancel = new JButton(new ImageIcon("images/stop.jpg")),
    square = new JButton(new ImageIcon("images/carre.jpg")),
    tri = new JButton(new ImageIcon("images/triangle.jpg")),
    circle = new JButton(new ImageIcon("images/rond.jpg")),
    star = new JButton(new ImageIcon("images/etoile.jpg"));
    
    Dimension tailleEcran = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    int hauteur = (int)tailleEcran.getHeight();
    int largeur = (int)tailleEcran.getWidth();

    private Color fondBouton = Color.white;
    
    //CONSTRUCTEUR
    public Mesinfos()
    {
        this.setName("Accueil");
        this.setTitle("Accunkbffeil");
        this.initToolbar();
        this.setVisible(true);
    }

    
    private void initToolbar()
    {
       
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);//maximiser la fenetre
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        this.menuBar.add(Accueil);
        this.menuBar.add(Profil);
        this.menuBar.add(Documents);
        this.setJMenuBar(menuBar);
        this.setVisible(true);

        this.Accueil.add(aller);
        this.Documents.add(transfert);
        Container c = getContentPane();
        BorderLayout bl=new BorderLayout();
        
        panOne.setLayout(bl);
        


        c.add(BorderLayout.CENTER, panOne);
        c.add(BorderLayout.EAST, panOne.add(boutonConnexion));
        c.add(BorderLayout.WEST, panOne.add(boutonMesInfos));
        c.add(BorderLayout.SOUTH, panOne.add(boutonMentionsLegales));
        
        //ajout d'un écouteur au boutonMesInfos
        //boutonMesInfos.addActionListener(new BoutonListener());
        
        this.toolBar.add(play);
        this.toolBar.add(cancel);
        this.toolBar.add(square);
        this.toolBar.add(tri);
        this.toolBar.add(circle);
        this.toolBar.add(star);
        
        this.add(toolBar, BorderLayout.NORTH);        
        this.play.setBackground(fondBouton);
        this.cancel.setBackground(fondBouton);
        this.square.setBackground(fondBouton);
        this.tri.setBackground(fondBouton);
        this.circle.setBackground(fondBouton);
        this.star.setBackground(fondBouton);
    }
}
