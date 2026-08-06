/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut;


import ac.za.tut.memberClass.MemberClass;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Wanele Mashego
 */
public class JFileChooserTest extends JFrame {

    
    
    //JComboBox
    private JComboBox jcomboBox;
    //JCheckBox
    private JCheckBox jcheckBox;
    //JRadioButton
    private JRadioButton monthtomonthRb;
    private JRadioButton annualRb;
    private JRadioButton sixmonthRb;
    
    private ButtonGroup group;
     //JLabel
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idnoLbl;
    private JLabel genderLbl;
    private JLabel contractTypeLbl;
    private JLabel selectPersonalTrainerLbl;
    //JTextField
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField idnoTxtFld;
    //JButton
    private JButton registerBtn;
    private JButton searchBtn;
    private JButton updateBtn;
    private JButton removeBtn;
    private JButton displayallBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    //Jpanels
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idnoPnl;
    private JPanel genderPnl;
    private JPanel contractTypePnl;
    private JPanel checkBoxPnl;
    private JPanel clientDetailPnl;
    private JPanel contractDetailPnl;
    private JPanel textAreaPnl;
    private JPanel mainPnl;
    private JPanel btnPnl;
    //JTextArea
    private JTextArea textArea;
    //JScrollPane
    private JScrollPane jscrollpane;
    private ArrayList<MemberClass> members;
    
    public JFileChooserTest() {
        
        
        setTitle("GYM MEMBERSHIP  ");
        setSize(400,400);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        members = new ArrayList<>();
        //
        clientDetailPnl = new JPanel(new GridLayout(4,1,1,1));
        clientDetailPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Clients Details "));
        
        contractDetailPnl = new JPanel(new GridLayout(2,1,1,1));
        contractDetailPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract Option "));
        
        mainPnl = new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        idnoPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        contractTypePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        checkBoxPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        textAreaPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //
        headingLbl = new JLabel("MEMBERSHIP FORM ");
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setForeground(Color.BLUE);
        
        nameLbl = new JLabel("Name : ");
        surnameLbl = new JLabel("Surname : ");
        idnoLbl = new JLabel("ID NO : ");
        genderLbl = new JLabel("Gender ");
        contractTypeLbl = new JLabel("Type of Contract ");
        selectPersonalTrainerLbl = new JLabel("Select check if you need a personal trainer ");
        //
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        idnoTxtFld = new JTextField(20);
        //
        textArea = new JTextArea(20,20);
        textArea.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Member(s) details"));
        //
        jcheckBox = new JCheckBox();
        //
        jcomboBox = new JComboBox();
        jcomboBox.addItem("Male");
        jcomboBox.addItem("Female");
        //
        monthtomonthRb = new JRadioButton("month-to-month");
        sixmonthRb = new JRadioButton("six-to-month");
        annualRb = new JRadioButton("annual");
        
        group = new ButtonGroup();
        
        group.add(monthtomonthRb);
        group.add(sixmonthRb);
        group.add(annualRb);
        //
        registerBtn = new JButton("REGISTER");
        registerBtn.addActionListener(new RegisterBtnListener());
        
        searchBtn = new JButton("SEARCH");
        
        
        updateBtn = new JButton("UPDATE");
        
        
        removeBtn = new JButton("REMOVE");
        
        
        displayallBtn = new JButton("DISPLAY ALL");
        displayallBtn.addActionListener(new DisplayallBtnListener());
        
        clearBtn = new JButton("CLEAR");
        clearBtn.addActionListener(new ClearBtnListener());
        
        exitBtn = new JButton("EXIT");
        exitBtn.addActionListener(new ExitBtnListener());
        ///
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        idnoPnl.add(idnoLbl);
        idnoPnl.add(idnoTxtFld);
        
        genderPnl.add(genderLbl);
        genderPnl.add(jcomboBox);
        
        clientDetailPnl.add(namePnl);
        clientDetailPnl.add(surnamePnl);
        clientDetailPnl.add(idnoPnl);
        clientDetailPnl.add(genderPnl);
        
        contractTypePnl.add(contractTypeLbl);
        contractTypePnl.add(monthtomonthRb);
        contractTypePnl.add(sixmonthRb);
        contractTypePnl.add(annualRb);
        
        checkBoxPnl.add(selectPersonalTrainerLbl);
        checkBoxPnl.add(jcheckBox);
        
        contractDetailPnl.add(contractTypePnl);
        contractDetailPnl.add(checkBoxPnl);
        
        textAreaPnl.add(textArea);
        jscrollpane  = new JScrollPane(textArea ,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS ,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        btnPnl.add(registerBtn);
        btnPnl.add(searchBtn);
        btnPnl.add(updateBtn);
        btnPnl.add(removeBtn);
        btnPnl.add(displayallBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        mainPnl.add(clientDetailPnl , BorderLayout.NORTH);
        mainPnl.add(contractDetailPnl ,BorderLayout.CENTER );
        mainPnl.add(jscrollpane ,BorderLayout.SOUTH );
        
        add(headingPnl ,BorderLayout.NORTH);
        add(mainPnl ,BorderLayout.CENTER);
        add(btnPnl ,BorderLayout.SOUTH);
        
        pack();
        setVisible(true); 
        
    }
    
    private class ExitBtnListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
           System.exit(1);
        }
        
    }
    
    public void clearfields()
    {
        
        nameTxtFld.setText("");
        surnameTxtFld.setText("");
        idnoTxtFld.setText("");
        jcomboBox.setSelectedItem("");
        group.clearSelection();
        jcheckBox.setSelected(false);
        
        
        nameTxtFld.setFocusable(true);
    }
    
     private class ClearBtnListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
           
            clearfields();
        }
    
     }
     
     private class DisplayallBtnListener implements ActionListener
        {

            @Override
            public void actionPerformed(ActionEvent e) {
               
                String data,records = "";
                File file;
                BufferedReader br;
                JFileChooser fc;
                int val;
                fc = new JFileChooser();
                
                val = fc.showOpenDialog(JFileChooserTest.this);
                
                if(val == JFileChooser.APPROVE_OPTION)
                {
                    try
                    {
                        file = fc.getSelectedFile();
                        
                        br = new BufferedReader(new FileReader(file));
                        
                        while((data = br.readLine()) != null)
                        {
                            records += data + "/n";
                        }
                        
                        br.close();
                        
                        textArea.setText(records);
                    }
                    catch(FileNotFoundException ex)
                    {
                        Logger.getLogger(JFileChooserTest.class.getName()).log(Level.SEVERE,null,ex);
                    }
                    catch(IOException ex)
                    {
                        Logger.getLogger(JFileChooserTest.class.getName()).log(Level.SEVERE,null,ex);
                    }
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(JFileChooserTest.this, "Error please try again ");
                }
                
            }
            
     }
     
     private class RegisterBtnListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            MemberClass member ;
            int val ;
            File file;
            String data = "";
            JFileChooser fc ;
            BufferedWriter bw;
            
            String name = nameTxtFld.getText();
            String surname = surnameTxtFld.getText();
            String idno = idnoTxtFld.getText();
            String gender = (String) jcomboBox.getSelectedItem();
            boolean isPersonalTrainerNeeded = jcheckBox.isSelected();
            String contractType  = "month-to-month";
            if(sixmonthRb.isSelected())
            {
                contractType = "six month";
            }
            else if(annualRb.isSelected())
            {
                contractType = "annual";
            }
            
            
            member = new MemberClass(name,surname,idno,gender,contractType,isPersonalTrainerNeeded);
           
            fc = new JFileChooser();
            
            val = fc.showSaveDialog(JFileChooserTest.this);
             
            if(val == JFileChooser.APPROVE_OPTION)
            {
                try
                {
                    file = fc.getSelectedFile();
                    
                    bw = new BufferedWriter(new FileWriter(file));
                    
                    bw.write(member.toString());
                    
                    bw.newLine();
                    
                    bw.close();
                    
                    clearfields();
                    
                    JOptionPane.showMessageDialog(JFileChooserTest.this, "File Save Successful");
                }
                catch(IOException ex)
                {
                    Logger.getLogger(JFileChooserTest.class.getName()).log(Level.SEVERE,null,ex);
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(JFileChooserTest.this, "Process Failed because of " + val);
            }
            
        }
        
        
            
        }
                
            
        
        
     }

        
    

