package ac.za.tut.greetings;
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
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class GreetinsFrame extends JFrame {
    //JPanels
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndSurnamePnl;
    private JPanel textAreaPnl;
    private JPanel mainPnl;
    private JPanel btnPnl;
    
    //JLabel
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    //JButton
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    //JTextFields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    //JTextArea
    private JTextArea greetingsTxtArea;
    
    public GreetinsFrame() {
        
        setTitle("Greetings GUI ");
        setSize(400,400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //
        headingPnl = new JPanel(new FlowLayout());
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        btnPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new FlowLayout());
        textAreaPnl = new JPanel(new FlowLayout());
        textAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK ,2) , "Greetings Area"));
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
        //
        headingLbl = new JLabel("GREETINGS APP");
        nameLbl = new JLabel("Name : ");
        surnameLbl = new JLabel("Surname : ");
        //
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        //
        greetBtn = new JButton("GREET");
        clearBtn = new JButton("CLEAR");
        exitBtn = new JButton("EXIT");
        //
        
        greetingsTxtArea = new JTextArea(30 , 30);
        
        greetingsTxtArea.setText("Hello[name][surname]");
        greetingsTxtArea.setFocusable(false);
        //////
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        textAreaPnl.add(greetingsTxtArea);
        
        
        btnPnl.add(greetBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        mainPnl.add(nameAndSurnamePnl);
        mainPnl.add(textAreaPnl);
        
        add(headingPnl ,BorderLayout.NORTH);
        add(mainPnl ,BorderLayout.CENTER);
        add(btnPnl ,BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    
}
