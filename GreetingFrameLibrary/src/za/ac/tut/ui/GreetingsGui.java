/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Wanele Mashego
 */
public class GreetingsGui extends JFrame {

    //JPanels
    private  JPanel namePnl;
    private  JPanel surnamePnl;
    private  JPanel nameAndSurnamePnl;
    private  JPanel greetingsAreaPnl;
    private  JPanel mainPnl;
    private  JPanel btnPnl;
    private  JPanel headingsPnl;
    
    //JLabel
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel greetingsLbl;
    
    //JTextField
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //JTextArea
    private JTextArea greetingsTxtArea;
    
    //JButtons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public GreetingsGui() {
        
        setTitle("");
        setSize(150,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        
        //create panels
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
        greetingsAreaPnl = new JPanel(new BorderLayout());
        
        mainPnl = new JPanel(new BorderLayout());
        
        btnPnl = new JPanel(new FlowLayout());
        headingsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER)); 
        headingsPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //create Labels
        greetingsLbl = new JLabel("Greetings App");
        surnameLbl = new JLabel("Surname :");
        nameLbl = new JLabel("Name : ");
        
        //create TextFields
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        
        //create TextArea
        greetingsTxtArea = new JTextArea(40,40);
        greetingsTxtArea.setEditable(false);
        greetingsTxtArea.setText("Hello [Name] [Surname] ");
        
        //create Button
        greetBtn = new JButton("GREET");
        clearBtn = new JButton("CLEAR");
        exitBtn = new JButton("EXIT");
        
        //add everything to panel
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        headingsPnl.add(greetingsLbl);
        
        greetingsAreaPnl.add(greetingsTxtArea);
        greetingsTxtArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1)," Greetings Text"));
        
        btnPnl.add(greetBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        mainPnl.add(nameAndSurnamePnl , BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl ,BorderLayout.CENTER);
        mainPnl.add(btnPnl , BorderLayout.SOUTH);
        
        add(headingsPnl , BorderLayout.NORTH);
        add(mainPnl , BorderLayout.CENTER);
        
        
        setVisible(true);
    }
    
    
}
