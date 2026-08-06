/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.ticketSale;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Wanele Mashego
 */
public class TicketSale extends JFrame{

    //JLabel
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel hometeamLbl;
    private JLabel awayteamLbl;
    private JLabel costpriceLbl;
    private JLabel numTicketLbl;
    private JLabel totalLbl;
    //JTextField
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField hometeamTxtFld;
    private JTextField awayteamTxtFld;
    private JTextField costpriceTxtFld;
    private JTextField totalTxtFld;
    //JButton
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    //JSlider
    private JSlider jslider;
    //Jpanels
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel costpricePnl;
    private JPanel hometeamPnl;
    private JPanel awayteamPnl;
    private JPanel numTicketPnl;
    private JPanel totalPnl;
    private JPanel customerDetailPnl;
    private JPanel ticketDetailPnl;
    private JPanel mainPnl;
    private JPanel btnPnl;
    
    public TicketSale() {
        
        setTitle("TICKET SALE ");
        setSize(400,400);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //
        customerDetailPnl = new JPanel(new GridLayout(2,1,1,1));
        customerDetailPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE ,3) ,"Customer Details"));
        
        ticketDetailPnl = new JPanel(new GridLayout(5,1,1,1));
        ticketDetailPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE ,3),"Ticket Details"));
        
        mainPnl = new JPanel(new GridLayout(2,1));
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        hometeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayteamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        costpricePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numTicketPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totalPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        //
        headingLbl = new JLabel("SOCCER MATCH TICKET");
        headingLbl.setFont(new Font(Font.SANS_SERIF , Font.BOLD + Font.ITALIC , 30));
        headingLbl.setForeground(Color.CYAN);
        
        nameLbl = new JLabel("Name : ");
        surnameLbl = new JLabel("Surname : ");
        hometeamLbl = new JLabel("HomeTeam : ");
        awayteamLbl = new JLabel("AwayTeam : ");
        costpriceLbl = new JLabel("Cost Price : ");
        numTicketLbl = new JLabel("Number of ticket required : ");
        totalLbl = new JLabel("Total amount due : ");
        //
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        hometeamTxtFld = new JTextField(20);
        awayteamTxtFld = new JTextField(20);
        costpriceTxtFld = new JTextField(20);
        totalTxtFld = new JTextField(20);
        totalTxtFld.setText("to be calculated");
        //
        jslider = new JSlider(0,50,25);
        jslider.setPaintTicks(true);
        jslider.setMinorTickSpacing(5);
        
        jslider.setPaintTrack(true);
        jslider.setMajorTickSpacing(10);
        //
        buyBtn = new JButton("BUY");
        clearBtn = new JButton("CLEAR");
        exitBtn = new JButton("EXIT");
        ////
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        customerDetailPnl.add(namePnl);
        customerDetailPnl.add(surnamePnl);
        
        hometeamPnl.add(hometeamLbl);
        hometeamPnl.add(hometeamTxtFld);
        
        awayteamPnl.add(awayteamLbl);
        awayteamPnl.add(awayteamTxtFld);
        
        costpricePnl.add(costpriceLbl);
        costpricePnl.add(costpriceTxtFld);
        
        numTicketPnl.add(numTicketLbl);
        numTicketPnl.add(jslider);
        
        totalPnl.add(totalLbl);
        totalPnl.add(totalTxtFld);
        
        ticketDetailPnl.add(hometeamPnl);
        ticketDetailPnl.add(awayteamPnl);
        ticketDetailPnl.add(costpricePnl);
        ticketDetailPnl.add(numTicketPnl);
        ticketDetailPnl.add(totalPnl);
        
        btnPnl.add(buyBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        mainPnl.add(customerDetailPnl);
        mainPnl.add(ticketDetailPnl);
        
        add(headingPnl , BorderLayout.NORTH);
        add(mainPnl , BorderLayout.CENTER);
        add(btnPnl , BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
    
}
