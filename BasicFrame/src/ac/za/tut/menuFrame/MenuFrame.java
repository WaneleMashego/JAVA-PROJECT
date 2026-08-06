/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.menuFrame;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Wanele Mashego
 */
public class MenuFrame extends JFrame{

    //JMenuBar
    private JMenuBar menuBar;
    //JMenu
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu viewMenu;
    
    private JMenu editorsMenu;
    private JMenu splitMenu;
    //JMenuItem
    private JMenuItem newprojectMI;
    private JMenuItem newfileMI;
    private JMenuItem openprojectMI;
    private JMenuItem openrecentprojectMI;
    private JMenuItem closeallprojectMI;
    
    private JMenuItem undoMI;
    private JMenuItem redoMI;
    private JMenuItem cutMI;
    private JMenuItem copyMI;
    private JMenuItem pasteMI;
    //
    private JMenuItem sourceMI;
    //
    private JMenuItem horizontallyMI;
    private JMenuItem verticallyMI;
    private JMenuItem clearMI;
    
    public MenuFrame() {
        
        setTitle("GYM MEMBERSHIP  ");
        setSize(300,300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        menuBar = new JMenuBar();
        //
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        viewMenu = new JMenu("View");
        //
        editorsMenu = new JMenu("Editors");
        splitMenu = new JMenu("Split");
        //
        newprojectMI = new JMenuItem("new project");
        newfileMI = new JMenuItem("new file"); 
        openprojectMI = new JMenuItem("open project");
        openrecentprojectMI = new JMenuItem("open recent project");
        closeallprojectMI = new JMenuItem("close all project");
        
        undoMI = new JMenuItem("Undo");
        redoMI = new JMenuItem("Redo"); 
        cutMI = new JMenuItem("Cut");
        copyMI = new JMenuItem("Copy");
        pasteMI = new JMenuItem("Paste");
        //
        sourceMI = new JMenuItem("Source");
        //
        horizontallyMI = new JMenuItem("horizontally");
        verticallyMI = new JMenuItem("vertically"); 
        clearMI = new JMenuItem("clear");
        ///
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        
        viewMenu.add(editorsMenu);
        viewMenu.add(splitMenu);
        /////
        fileMenu.add(newprojectMI);
        fileMenu.add(newfileMI);
        fileMenu.add(openprojectMI);
        fileMenu.add(openrecentprojectMI);
        fileMenu.add(closeallprojectMI);
        //
        editMenu.add(redoMI);
        editMenu.add(undoMI);
        editMenu.add(cutMI);
        editMenu.add(copyMI);
        editMenu.add(pasteMI);
        //
        editorsMenu.add(sourceMI);
        //
        splitMenu.add(horizontallyMI);
        splitMenu.add(verticallyMI);
        splitMenu.add(clearMI);
        
        
        setJMenuBar(menuBar);
        
        setVisible(true);
    }
    
    
}
