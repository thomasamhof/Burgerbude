import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class GUI extends JFrame{
    Burger tempBurger;
    BurgerBude bbErl = BurgerBudeVegan.getInstance(new BurgerBude("Erlangen"));
    BurgerBude bbNbg = BurgerBudeFleisch.getInstance(new BurgerBude("Nuernberg"));
    BurgerBude tempBb;
    BurgerFactory BurgerFabrik = new BurgerFactory();
    Container c;
    JLabel label;
    JTextArea taAusgabe;
    String[] zutaten={"Tomate","Zwiebel","Gurke","Relish", "Kaese", "Bacon" };
    JButton bBudeErl, bBudeNbg, bHam, bCheese, bChicken, bProf, bTplus,bTmin,bZplus,bZmin,bGplus,bGmin,bRplus,bRmin,bKplus,bKmin,bBplus,bBmin;
    
    public GUI (){
        c=getContentPane();
        c.setLayout(null);
       this.setSize(800,600);
        
        // Burger-Auswahl Buttons (oben)
        bBudeErl = new JButton("BurgerBude Erlangen");
        bBudeNbg = new JButton("BurgerBude Nürnberg");
        bHam = new JButton("Hamburger");
        bCheese = new JButton("Cheeseburger");
        bChicken = new JButton("Chickenburger");
        bProf = new JButton("Professorburger");
        
        bBudeErl.setBounds(50, 30, 200, 30);
        bBudeNbg.setBounds(300, 30, 200, 30);
        bHam.setBounds(50, 80, 200, 30);
        bCheese.setBounds(300, 80, 200, 30);
        bChicken.setBounds(50, 130, 200, 30);
        bProf.setBounds(300, 130, 200, 30);
        
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
        int startY = 200;
        int abstandX = 200;  // Abstand zwischen den Zutaten-Gruppen
        
        // Erste Reihe: Tomate, Zwiebel, Gurke
        // Tomate
        JLabel lTomate = new JLabel("Tomate");
        lTomate.setBounds(startX, startY, 100, 20);
        bTplus.setBounds(startX, startY + 25, 50, 30);
        bTmin.setBounds(startX + 60, startY + 25, 50, 30);
        
        // Zwiebel
        JLabel lZwiebel = new JLabel("Zwiebel");
        lZwiebel.setBounds(startX + abstandX, startY, 100, 20);
        bZplus.setBounds(startX + abstandX, startY + 25, 50, 30);
        bZmin.setBounds(startX + abstandX + 60, startY + 25, 50, 30);
        
        // Gurke
        JLabel lGurke = new JLabel("Gurke");
        lGurke.setBounds(startX + abstandX * 2, startY, 100, 20);
        bGplus.setBounds(startX + abstandX * 2, startY + 25, 50, 30);
        bGmin.setBounds(startX + abstandX * 2 + 60, startY + 25, 50, 30);
        
        // Zweite Reihe: Relish, Käse, Bacon
        int zweiteReiheY = startY + 100;
        
        // Relish
        JLabel lRelish = new JLabel("Relish");
        lRelish.setBounds(startX, zweiteReiheY, 100, 20);
        bRplus.setBounds(startX, zweiteReiheY + 25, 50, 30);
        bRmin.setBounds(startX + 60, zweiteReiheY + 25, 50, 30);
        
        // Käse
        JLabel lKaese = new JLabel("Käse");
        lKaese.setBounds(startX + abstandX, zweiteReiheY, 100, 20);
        bKplus.setBounds(startX + abstandX, zweiteReiheY + 25, 50, 30);
        bKmin.setBounds(startX + abstandX + 60, zweiteReiheY + 25, 50, 30);
        
        // Bacon
        JLabel lBacon = new JLabel("Bacon");
        lBacon.setBounds(startX + abstandX * 2, zweiteReiheY, 100, 20);
        bBplus.setBounds(startX + abstandX * 2, zweiteReiheY + 25, 50, 30);
        bBmin.setBounds(startX + abstandX * 2 + 60, zweiteReiheY + 25, 50, 30);
        
        // Labels zum Container hinzufügen
        c.add(lTomate); c.add(lZwiebel); c.add(lGurke);
        c.add(lRelish); c.add(lKaese); c.add(lBacon);
        
        // Buttons zum Container hinzufügen
        c.add(bTplus); c.add(bTmin);
        c.add(bZplus); c.add(bZmin);
        c.add(bGplus); c.add(bGmin);
        c.add(bRplus); c.add(bRmin);
        c.add(bKplus); c.add(bKmin);
        c.add(bBplus); c.add(bBmin);
        
        // Burger-Buttons zum Container hinzufügen
        c.add(bBudeErl);
        c.add(bBudeNbg);
        c.add(bHam);
        c.add(bCheese);
        c.add(bChicken);
        c.add(bProf);

        //ButtonListener implementieren und Buttons zuordnen
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

        taAusgabe = new JTextArea("Ihre Bestellung");
        // Position unterhalb der Zutaten-Buttons (bei zweiteReiheY + 100)
        taAusgabe.setBounds(50, zweiteReiheY + 100, 600, 250);
        c.add(taAusgabe);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            // Burger-Auswahl Commands
            if (e.getActionCommand().equals("erl")) {
                // Burgerbude Erlangen ausgewählt
                tempBb = bbErl;
                tempBurger = null;
                taAusgabe.setText(tempBb.getStandort());
            }
            else if (e.getActionCommand().equals("nbg")) {
                // Burgerbude Nürnberg ausgewählt
                tempBb=bbNbg;
                tempBurger = null;
                taAusgabe.setText(tempBb.getStandort());
            }
            else if (e.getActionCommand().equals("ham") || e.getActionCommand().equals("cheese") || e.getActionCommand().equals("chicken") || e.getActionCommand().equals("prof")) {
                // Hamburger ausgewählt
                tempBurger=null;
                tempBurger = BurgerFabrik.erstelleBurger(e.getActionCommand());
                taAusgabe.setText(String.format("%s\n\n%s", tempBb.getStandort(),tempBurger.verpacken()));

            }
            else {
                tempBurger = BurgerFabrik.belegeBurger(e.getActionCommand(), tempBurger);
                taAusgabe.setText(String.format("%s\n\n%s", tempBb.getStandort(),tempBurger.verpacken()));
            }
        }


    }

}