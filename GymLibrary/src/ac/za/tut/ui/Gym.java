/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.ui;

import ac.za.tut.Member;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout.Group;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Wanele Mashego
 */
public class Gym extends JFrame {
 
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNumberPnl;
    private JPanel genderPnl;
    private JPanel clientDetailsPnl;
    private JPanel contractTypePnl;
    private JPanel checkBoxPnl;
    private JPanel contractOptionPnl;
    private JPanel textAreaPnl;
    private JPanel mainPnl;
    private JPanel btnPnl;
    
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNumberLbl;
    private JLabel headingLbl;
    private JLabel genderLbl;
    private JLabel contractTypeLbl;
    private JLabel checkBoxLbl;
    
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField idNumberTxtFld;
    
    private JCheckBox checkBox;
    
    private JComboBox combobox;
    
    private JScrollPane scrollPane;
    
    private JTextArea textArea;
    
    
    private ButtonGroup group;
    private JRadioButton monthtomonthRb;
    private JRadioButton sixmonthRb;
    private JRadioButton annualRb;
    
    private JButton registerBtn;
    private JButton searchBtn;
    private JButton updateBtn;
    private JButton removeBtn;
    private JButton displayAllBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    //List
    private ArrayList<Member> members;
    
    public Gym()
    {
        setTitle("GYM MEMBERSHIP ");
        setResizable(true);
        setSize(420,420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        members = new ArrayList<>();
        
        headingPnl = new JPanel(new FlowLayout());
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        idNumberPnl = new JPanel(new FlowLayout());
        genderPnl = new JPanel(new FlowLayout());
        contractTypePnl = new JPanel(new FlowLayout());
        checkBoxPnl = new JPanel(new FlowLayout());
        btnPnl = new JPanel(new FlowLayout());
        textAreaPnl = new JPanel(new FlowLayout());
        
        clientDetailsPnl = new JPanel(new GridLayout(4,1));
        clientDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Client Details "));
        
        contractOptionPnl = new JPanel(new GridLayout(2,1));
        contractOptionPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract Option "));
                
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("MEMBERSHIP FORM ");
        headingLbl.setFont(new Font(Font.SANS_SERIF , Font.ITALIC + Font.BOLD,20));
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setForeground(Color.CYAN);
        
        nameLbl = new JLabel("Name : ");
        surnameLbl = new JLabel("Surname : ");
        idNumberLbl = new JLabel("ID NO : ");
        genderLbl  = new JLabel("Gender : ");
        contractTypeLbl = new JLabel("Type of Contract : ");
        checkBoxLbl = new JLabel("Select the checkbox iff you need a personal trainer ");
        
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        idNumberTxtFld = new JTextField(20);
        
        combobox = new JComboBox();
        combobox.addItem("Male");
        combobox.addItem("Female");
        
        checkBox = new JCheckBox();
       
        monthtomonthRb = new JRadioButton("month-to-month");
        sixmonthRb = new JRadioButton("six month");
        annualRb = new JRadioButton("annual");
        
        group = new ButtonGroup();
        group.add(monthtomonthRb);
        group.add(sixmonthRb);
        group.add(annualRb);
        
        textArea = new JTextArea(20,20);
        textArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK),"Member(s) details "));
        
        scrollPane = new JScrollPane(textArea , JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        registerBtn = new JButton("REGISTER");
        registerBtn.addActionListener(new RegisterBtnListener());
        
        searchBtn = new JButton("SEARCH");
        updateBtn = new JButton("UPDATE");
        removeBtn = new JButton("REMOVE");
        displayAllBtn = new JButton("DISPLAY ALL");
        clearBtn = new JButton("CLEAR");
        clearBtn.addActionListener(new ClearBtnListener());
        
        exitBtn = new JButton("EXIT");
        exitBtn.addActionListener(new ExitBtnListener());
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        idNumberPnl.add(idNumberLbl);
        idNumberPnl.add(idNumberTxtFld);
        
        genderPnl.add(genderLbl);
        genderPnl.add(combobox);
        
        clientDetailsPnl.add(namePnl);
        clientDetailsPnl.add(surnamePnl);
        clientDetailsPnl.add(idNumberPnl);
        clientDetailsPnl.add(genderPnl);
        
        contractTypePnl.add(contractTypeLbl);
        contractTypePnl.add(monthtomonthRb);
        contractTypePnl.add(sixmonthRb);
        contractTypePnl.add(annualRb);
        
        checkBoxPnl.add(checkBoxLbl);
        checkBoxPnl.add(checkBox);
        
        contractOptionPnl.add(contractTypePnl);
        contractOptionPnl.add(checkBoxPnl);
        
        textAreaPnl.add(scrollPane);
        
        btnPnl.add(registerBtn);
        btnPnl.add(searchBtn);
        btnPnl.add(updateBtn);
        btnPnl.add(removeBtn);
        btnPnl.add(displayAllBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        
        mainPnl.add(clientDetailsPnl , BorderLayout.NORTH);
        mainPnl.add(contractOptionPnl , BorderLayout.CENTER);
        mainPnl.add(textAreaPnl , BorderLayout.SOUTH);
        
        add(headingPnl , BorderLayout.NORTH);
        add(mainPnl , BorderLayout.CENTER);
        add(btnPnl , BorderLayout.SOUTH);
        
        pack();
        setVisible(true);
    }
    
    private  class RegisterBtnListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String name = nameTxtFld.getText();
            String surname = surnameTxtFld.getText();
            String idNumber = idNumberTxtFld.getText();
            
            String gender = combobox.getSelectedItem().toString();
            
            String contractType = "monthtomonth";
            
            if (sixmonthRb.isSelected())
            {
                contractType = "six month";
            }else if (annualRb.isSelected())
            {
                contractType = "annual ";
            }
            
            Boolean isPersonalTrainerSelected = checkBox.isSelected();
            
            Member member = new Member(name,surname,idNumber,gender,contractType,isPersonalTrainerSelected);
            
            members.add(member);
            
            textArea.setText("The member has been successfully Added ");
            
        }
        
    }
    
    
    private class ExitBtnListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
           
            System.exit(1);
        }
        
    }
    
    private class ClearBtnListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            nameTxtFld.setText("");
            surnameTxtFld.setText("");
            idNumberTxtFld.setText("");
            checkBox.setSelected(false);
            group.clearSelection();
            
            textArea.setText("");
            
            nameTxtFld.setFocusable(true);
        }
        
        
    }
   
    
    
}
