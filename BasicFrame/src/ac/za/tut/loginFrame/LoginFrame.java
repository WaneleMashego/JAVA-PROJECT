/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.loginFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Wanele Mashego
 */
public class LoginFrame extends JFrame{
 
    //JButton
    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    //JLabel
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel passwordLbl;
    //JTextField
    private JTextField nameTxt;
    private JTextField passwordTxt;
    //JPanel
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel passwordPnl;
    private JPanel loginDetailsPnl;
    private JPanel btnPnl;
    
    public LoginFrame() {
        
        setTitle("Greetings GUI ");
        setSize(400,400);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT)); 
        
        loginDetailsPnl = new JPanel(new GridLayout(2,1));
        loginDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Login Details"));
        //
        headingLbl = new JLabel("LOGIN");
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setFont(new Font(Font.SANS_SERIF , Font.BOLD + Font.ITALIC ,30));
        
        nameLbl = new JLabel("Name : ");
        nameLbl.setFocusable(true);
        
        passwordLbl = new JLabel("Passowrd : ");
        //
        nameTxt = new JTextField(20);
        passwordTxt = new JTextField(20);
        //
        submitBtn = new JButton("SUBMIT");
        clearBtn = new JButton("CLEAR");
        exitBtn = new JButton("EXIT");
        //////
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxt);
         
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordTxt);  
        
        
        
        loginDetailsPnl.add(namePnl);
        loginDetailsPnl.add(passwordPnl);
        
        
        btnPnl.add(submitBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        add(headingPnl , BorderLayout.NORTH);
        add(loginDetailsPnl , BorderLayout.CENTER);
        add(btnPnl , BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
}
