/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UndertaleAppController;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author Usuario
 */
public class UndertalePanel extends JPanel{
	
    private UndertaleAppController baseController;
    private SpringLayout baseLayout;
	private JRadioButton characterSans;
	private JLabel characterLabel;
	private JTextField text;
	private JButton go;
	private byte[] image;
	private JLabel icon;
    
    public UndertalePanel(UndertaleAppController baseController){
        this.baseController = baseController;
        
        characterLabel = new JLabel("Character:");
        characterSans = new JRadioButton("Sans", true);
        icon = new JLabel("image");
        Image img = new ImageIcon(this.getClass().getResource("/Sans.png")).getImage();
        icon.setIcon(new ImageIcon(img));

        text = new JTextField(20);
        go = new JButton("go!");
        
        baseLayout = new SpringLayout();
                
        setupPanel();
        setupLayout();
        setupListeners();
    }
    
    private void setupLayout(){
    	baseLayout.putConstraint(SpringLayout.NORTH, go, 33, SpringLayout.SOUTH, text);
        baseLayout.putConstraint(SpringLayout.WEST, go, 206, SpringLayout.WEST, this);
        baseLayout.putConstraint(SpringLayout.SOUTH, go, 67, SpringLayout.SOUTH, text);
        baseLayout.putConstraint(SpringLayout.EAST, go, 290, SpringLayout.WEST, this);
        baseLayout.putConstraint(SpringLayout.NORTH, text, 175, SpringLayout.SOUTH, characterLabel);
        baseLayout.putConstraint(SpringLayout.SOUTH, text, -129, SpringLayout.SOUTH, this);
        baseLayout.putConstraint(SpringLayout.WEST, text, 0, SpringLayout.WEST, characterLabel);
        baseLayout.putConstraint(SpringLayout.EAST, text, 467, SpringLayout.WEST, this);
        baseLayout.putConstraint(SpringLayout.NORTH, characterLabel, 44, SpringLayout.NORTH, this);
        baseLayout.putConstraint(SpringLayout.WEST, characterLabel, 30, SpringLayout.WEST, this);
        baseLayout.putConstraint(SpringLayout.NORTH, characterSans, -4, SpringLayout.NORTH, characterLabel);
        baseLayout.putConstraint(SpringLayout.WEST, characterSans, 6, SpringLayout.EAST, characterLabel);
        baseLayout.putConstraint(SpringLayout.NORTH, icon, -165, SpringLayout.NORTH, text);
        baseLayout.putConstraint(SpringLayout.WEST, icon, 175, SpringLayout.WEST, this);
        baseLayout.putConstraint(SpringLayout.SOUTH, icon, -6, SpringLayout.NORTH, text);
        baseLayout.putConstraint(SpringLayout.EAST, icon, 306, SpringLayout.WEST, this);
    }
    
    private void setupPanel(){
    	this.setSize(500,500);
        this.setLayout(baseLayout);
        this.add(characterSans);
        this.add(characterLabel);
        this.add(text);
        this.add(go);
        this.add(icon);
    }
    
    private void setupListeners(){
        
        
    }
}
