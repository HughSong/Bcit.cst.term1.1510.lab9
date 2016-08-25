//************************************************************
// TelephonePanel.java
//
// Lays out a (functionless) GUI like a telephone keypad with a title.
// Illustrates use of BorderLayout and GridLayout.
//************************************************************
import java.awt.*;
import javax.swing.*;
public class TelephonePanel extends JPanel
{
public TelephonePanel()
{
//set BorderLayout for this panel
    setLayout(new BorderLayout(100,20));
//create a JLabel with "Your Telephone" title
    JLabel title = new JLabel("Your Telephone!!");
//add title label to north of this panel
    
//create panel to hold keypad and give it a 4x3 GridLayout
    JPanel keyPad = new JPanel();
    keyPad.setLayout(new GridLayout(4,3));
    
    
//add buttons representing keys to key panel
    add(keyPad,BorderLayout.CENTER);
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b10 = new JButton("*");
    JButton b11 = new JButton("0");
    JButton b12 = new JButton("#");
    keyPad.add(b1);
    keyPad.add(b2);
    keyPad.add(b3);
    keyPad.add(b4);
    keyPad.add(b5);
    keyPad.add(b6);
    keyPad.add(b7);
    keyPad.add(b8);
    keyPad.add(b9);
    keyPad.add(b10);
    keyPad.add(b11);
    keyPad.add(b12);
    
//add key panel to center of this panel
    JPanel heading = new JPanel();
    add(heading,BorderLayout.NORTH);
    heading.add(title);
}
}