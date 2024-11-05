import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {
    private Burger tempBurger;
    private BurgerBude bbErl = BurgerBudeVegan.getInstance(new BurgerBude("Erlangen"));
    private BurgerBude bbNbg = BurgerBudeFleisch.getInstance(new BurgerBude("Nuernberg"));
    private BurgerBude tempBb;
    private Container c;
    private JLabel lZwiebel, lTomate, lBacon, lGurke, lRelish, lKaese;
    private JTextArea taAusgabe;
    private JButton bBudeErl, bBudeNbg, bHam, bCheese, bChicken, bProf, bTplus, bTmin, bZplus, bZmin, bGplus, bGmin, bRplus,
            bRmin, bKplus, bKmin, bBplus, bBmin, bBestellen, bFertige;

    public GUI() {
        c = getContentPane();
        c.setLayout(null);
        this.setSize(900, 800);
        this.setLocationRelativeTo(null);

        // Burger-Auswahl Buttons (oben)
        bBudeErl = new JButton("BurgerBude Erlangen");
        bBudeNbg = new JButton("BurgerBude Nürnberg");
        bHam = new JButton("Hamburger");
        bCheese = new JButton("Cheeseburger");
        bChicken = new JButton("Chickenburger");
        bProf = new JButton("Professorburger");

        // Platzierung der Buttons
        bBudeErl.setBounds(50, 30, 350, 30);
        bBudeNbg.setBounds(450, 30, 350, 30);
        bHam.setBounds(50, 80, 150, 30);
        bCheese.setBounds(250, 80, 150, 30);
        bChicken.setBounds(450, 80, 150, 30);
        bProf.setBounds(650, 80, 150, 30);

        // Buttons Bestellen und Fertigen
        bBestellen = new JButton("Burger bestellen");
        bBestellen.setBounds(50, 630, 350, 50);
        bFertige = new JButton("bestellte Burger fertigen");
        bFertige.setBounds(450, 630, 350, 50);

        // Initialisierung der Plus/Minus Buttons
        bTplus = new JButton("+");
        bTmin = new JButton("-");
        bZplus = new JButton("+");
        bZmin = new JButton("-");
        bGplus = new JButton("+");
        bGmin = new JButton("-");
        bRplus = new JButton("+");
        bRmin = new JButton("-");
        bKplus = new JButton("+");
        bKmin = new JButton("-");
        bBplus = new JButton("+");
        bBmin = new JButton("-");

        // Zutaten-Labels und Steuerung
        int startX = 50;
        int startY = 150;
        int abstandX = 200; // Abstand zwischen den Zutaten-Gruppen

        // Erste Reihe: Tomate, Zwiebel, Gurke
        // Tomate
        lTomate = new JLabel("Tomate");
        lTomate.setBounds(startX, startY, 100, 20);
        bTplus.setBounds(startX, startY + 25, 50, 30);
        bTmin.setBounds(startX + 60, startY + 25, 50, 30);

        // Zwiebel
        lZwiebel = new JLabel("Zwiebel");
        lZwiebel.setBounds(startX + abstandX, startY, 100, 20);
        bZplus.setBounds(startX + abstandX, startY + 25, 50, 30);
        bZmin.setBounds(startX + abstandX + 60, startY + 25, 50, 30);

        // Gurke
        lGurke = new JLabel("Gurke");
        lGurke.setBounds(startX + abstandX * 2, startY, 100, 20);
        bGplus.setBounds(startX + abstandX * 2, startY + 25, 50, 30);
        bGmin.setBounds(startX + abstandX * 2 + 60, startY + 25, 50, 30);

        // Zweite Reihe: Relish, Käse, Bacon
        int zweiteReiheY = startY + 100;

        // Relish
        lRelish = new JLabel("Relish");
        lRelish.setBounds(startX, zweiteReiheY, 100, 20);
        bRplus.setBounds(startX, zweiteReiheY + 25, 50, 30);
        bRmin.setBounds(startX + 60, zweiteReiheY + 25, 50, 30);

        // Käse
        lKaese = new JLabel("Käse");
        lKaese.setBounds(startX + abstandX, zweiteReiheY, 100, 20);
        bKplus.setBounds(startX + abstandX, zweiteReiheY + 25, 50, 30);
        bKmin.setBounds(startX + abstandX + 60, zweiteReiheY + 25, 50, 30);

        // Bacon
        lBacon = new JLabel("Bacon");
        lBacon.setBounds(startX + abstandX * 2, zweiteReiheY, 100, 20);
        bBplus.setBounds(startX + abstandX * 2, zweiteReiheY + 25, 50, 30);
        bBmin.setBounds(startX + abstandX * 2 + 60, zweiteReiheY + 25, 50, 30);

        // Labels zum Container hinzufügen
        c.add(lTomate);
        c.add(lZwiebel);
        c.add(lGurke);
        c.add(lRelish);
        c.add(lKaese);
        c.add(lBacon);

        // Buttons zum Container hinzufügen
        c.add(bTplus);
        c.add(bTmin);
        c.add(bZplus);
        c.add(bZmin);
        c.add(bGplus);
        c.add(bGmin);
        c.add(bRplus);
        c.add(bRmin);
        c.add(bKplus);
        c.add(bKmin);
        c.add(bBplus);
        c.add(bBmin);

        // Burger-Buttons zum Container hinzufügen
        c.add(bBudeErl);
        c.add(bBudeNbg);
        c.add(bHam);
        c.add(bCheese);
        c.add(bChicken);
        c.add(bProf);
        c.add(bBestellen);
        c.add(bFertige);

        // ButtonListener implementieren und Buttons zuordnen
        ButtonListener zuhoerer = new ButtonListener();

        // Burger-Auswahl Buttons
        bBudeErl.addActionListener(zuhoerer);
        bBudeErl.setActionCommand("erl");
        bBudeNbg.addActionListener(zuhoerer);
        bBudeNbg.setActionCommand("nbg");
        bHam.addActionListener(zuhoerer);
        bHam.setActionCommand("ham");
        bCheese.addActionListener(zuhoerer);
        bCheese.setActionCommand("cheese");
        bChicken.addActionListener(zuhoerer);
        bChicken.setActionCommand("chicken");
        bProf.addActionListener(zuhoerer);
        bProf.setActionCommand("prof");
        bBestellen.addActionListener(zuhoerer);
        bBestellen.setActionCommand("bestellen");
        bFertige.addActionListener(zuhoerer);
        bFertige.setActionCommand("fertige");

        // Zutaten Plus/Minus Buttons
        bTplus.addActionListener(zuhoerer);
        bTplus.setActionCommand("t+");
        bTmin.addActionListener(zuhoerer);
        bTmin.setActionCommand("t-");

        bZplus.addActionListener(zuhoerer);
        bZplus.setActionCommand("z+");
        bZmin.addActionListener(zuhoerer);
        bZmin.setActionCommand("z-");

        bGplus.addActionListener(zuhoerer);
        bGplus.setActionCommand("g+");
        bGmin.addActionListener(zuhoerer);
        bGmin.setActionCommand("g-");

        bRplus.addActionListener(zuhoerer);
        bRplus.setActionCommand("r+");
        bRmin.addActionListener(zuhoerer);
        bRmin.setActionCommand("r-");

        bKplus.addActionListener(zuhoerer);
        bKplus.setActionCommand("k+");
        bKmin.addActionListener(zuhoerer);
        bKmin.setActionCommand("k-");

        bBplus.addActionListener(zuhoerer);
        bBplus.setActionCommand("b+");
        bBmin.addActionListener(zuhoerer);
        bBmin.setActionCommand("b-");

        //Text Area zur Ausgabe
        taAusgabe = new JTextArea("Ihre Bestellung");
        // Position unterhalb der Zutaten-Buttons (bei zweiteReiheY + 100)
        taAusgabe.setBounds(50, zweiteReiheY + 100, 600, 250);
        c.add(taAusgabe);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {

                if (e.getActionCommand().equals("erl")) {
                    // Burgerbude Erlangen ausgewählt
                    tempBb = bbErl;
                    tempBurger = null;
                    taAusgabe.setText(tempBb.getStandort());
                } else if (e.getActionCommand().equals("nbg")) {
                    // Burgerbude Nürnberg ausgewählt
                    tempBb = bbNbg;
                    tempBurger = null;
                    taAusgabe.setText(tempBb.getStandort());
                } else if (e.getActionCommand().equals("bestellen")) {
                    // ausgewählter Burger wird der Bestellliste hinzugefügt
                    if (tempBurger!=null){
                        tempBb.bestelleBurger(tempBurger);
                        taAusgabe.setText(tempBurger.getName() + " der Bestellung hinzugefuegt");
                        tempBb.setGeskosten(tempBb.getGeskosten() + tempBurger.kosten());
                        tempBurger=null;
                    } else {
                        taAusgabe.setText("kein Burger ausgewaehlt");
                    }

                } else if (e.getActionCommand().equals("fertige")) {
                    // alle Burger der Liste werden gefertigt und eine Zusammenfassung als Dialog ausgegeben
                    JDialog d = new JDialog();
                    try {
                        d.getContentPane().add(new JTextArea(tempBb.fertigeBurger()));
                    } catch (NullPointerException npe) {
                        taAusgabe.setText("kein Burger in der Bestellliste");
                    }
                    d.setSize(600, 700);
                    d.setVisible(true);
                    d.setLocationRelativeTo(null);

                    //Burger auf null setzen, geskosten auf 0 und die Bestellliste leeren
                    tempBb.bestellungen.clear();
                    tempBurger = null;
                    tempBb.setGeskosten(0);
                } else if (e.getActionCommand().equals("ham") || e.getActionCommand().equals("cheese")
                        || e.getActionCommand().equals("chicken") || e.getActionCommand().equals("prof")) {
                    // einer der Burger ausgewaehlt, Konstruktor wird über Factory aufgerufen
                    tempBurger = BurgerFactory.getInstance().erstelleBurger(e.getActionCommand());
                    taAusgabe.setText(String.format("%s\n%s", tempBb.getStandort(), tempBurger.verpacken()));
                } else {
                    // Topping ausgewählt, Konstruktor wird über Factory aufgerufen
                    try {
                        tempBurger = BurgerFactory.getInstance().belegeBurger(e.getActionCommand(), tempBurger);
                        taAusgabe.setText(String.format("%s\n%s", tempBb.getStandort(), tempBurger.verpacken()));
                    } catch (NullPointerException npe) {
                        taAusgabe.setText("kein Burger ausgewaehlt");
                    }

                }
            } catch (Exception ex) {
                taAusgabe.setText("keine BurgerBude ausgewaehlt");
            }
        }

    }

}