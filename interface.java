import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.*;

public class Inter extends JFrame
{
    private int n, m;			// taille de la fenetre
    private JFrame Plateau;
    private JPanel pan;
    public Inter(int n, int y)
    {
        this.n = n;
        this.m = y;
        this.Plateau = new JFrame();
        this.pan = new JPanel(new GridBagLayout());

        // Configuration de la fenetre
        this.Plateau.setTitle("Gr1");
        this.Plateau.setSize(this.n, this.m);
        this.Plateau.setLocationRelativeTo(null);
        this.Plateau.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // arrete le programme quand la fenetre est fermée
        // Définition des conteneurs
        JPanel ligneNom = new JPanel();			// Ligne 1 - Nom et type Personnage
        ligneNom.setBackground(Color.red);
        ligneNom.setPreferredSize(new Dimension(60, 40));
        JPanel BarreVie = new JPanel();		// Ligne 2 - 2 (barre de vie)
        BarreVie.setBackground(Color.green);
        BarreVie.setPreferredSize(new Dimension(60, 40));
        JPanel BarreHydration = new JPanel();			// Ligne 3 - barre d’hydratation
        BarreVie.setBackground(Color.BLUE);
        BarreVie.setPreferredSize(new Dimension(60, 40));
        JPanel BarreSatiete = new JPanel();		// Ligne 4 - barre de satiété
        BarreVie.setBackground(Color.black);
        BarreVie.setPreferredSize(new Dimension(60, 40));
        JPanel BarreMoral = new JPanel();			// Ligne 5 - barre de moral
        BarreMoral.setBackground(Color.YELLOW);
        BarreMoral.setPreferredSize(new Dimension(60, 40));
        JPanel content = new JPanel();			// Conteneur principal
        content.setPreferredSize(new Dimension(this.n, this.m));
        content.setBackground(Color.WHITE);
        content.setLayout(new GridBagLayout());	// layout manager
        GridBagConstraints c = new GridBagConstraints();
        // La ligne nom est sur la première ligne (x = 0, y = )
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        content.add(ligneNom, c);
        c.gridy = 1;
        c.gridwidth = GridBagConstraints.REMAINDER;
        content.add(BarreVie, c);
        c.gridy = 2;
        c.gridwidth = GridBagConstraints.REMAINDER;
        content.add(BarreHydration, c);
        c.gridy = 3;
        c.gridwidth = GridBagConstraints.REMAINDER;
        content.add(BarreSatiete, c);
        c.gridy = 4;
        content.add(BarreMoral, c);

        // Boutons
        JButton bQuitter = new JButton("Start");

    } }
