package calculatrice;

	import java.awt.Component;
	import java.awt.Container;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JMenu;
	import javax.swing.JPanel;


	public class test2 extends JFrame {
	  public test2() { 
	    setResizable(false); // important pour supprimer les boutons min/max
	    clearWindowButtons(this);
	    // taille de la fenêtre
	    setSize(400,300);
	    // centre la fenêtre
	    setLocationRelativeTo(null);
	    // aucune action sur la fermeture (comme il n'y a plus de boutons....)
	    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  

	    // pour pouvoir fermer la fenêtre
	    JPanel p = (JPanel) getContentPane();
	    p.setLayout(new FlowLayout());
	    JButton bClose = new JButton("Close");
	    bClose.addActionListener(new ActionListener(){  
	      public void actionPerformed(ActionEvent ae){  
	        System.exit(0);  
	      }  
	    });
	    p.add(bClose);
	  }
	  
	  public void clearWindowButtons(Component top) {
	    /* supprime le bouton ainsi que le menu qui apparait lors du clic sur la fenetre */
	    if(JButton.class.isInstance(top) || JMenu.class.isInstance(top)) {  
	      top.getParent().remove(top);  
	    }  
	    /* parcourt tous les conteneurs de la fenêtre */
	    if (Container.class.isInstance(top)) {  
	      Component[] comps = ((Container)top).getComponents();  
	      for(int x = 0, y = comps.length; x < y; x++)  
	        clearWindowButtons(comps[x]);  
	    }
	  }  
	  
	  public static void main(String[] args) {
	    /* Demande à la JVM de ne pas utiliser les décorations du système */
	    /* Doit être fait AVANT l'instance de la fenetre */
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    test2 window = new test2();
	    window.setVisible(true);
	    /* par contre les autres fenêtres aussi seront avec cette deco... */
	    JFrame other = new JFrame();
	    other.setSize(100, 100);
	    other.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    other.setLocation(window.getX() - 100, window.getY());
	    other.setVisible(true);
	    /* sauf si tu repasses la déco en mode système */
	    JFrame.setDefaultLookAndFeelDecorated(false);
	    other = new JFrame();
	    other.setSize(100, 100);
	    other.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    other.setLocation(window.getX() + window.getWidth(), window.getY());
	    other.setVisible(true);
	    
	  }

	}


