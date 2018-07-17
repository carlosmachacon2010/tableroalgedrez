/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.appalgedrez.model;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Machacon
 */
public class Algedrez extends JDialog{

    public Algedrez() {
        confVentana();
        inicializarComponente();
    }
    public void confVentana(){
      this.setTitle("Algedrez de Carlos Machacon");
      this.setResizable(false);
       this.setSize(500,500);
      this.setLocationRelativeTo(null);
      GridLayout gr=new  GridLayout(8,8);
      this.setLayout(gr);
      this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
    }
    public void inicializarComponente(){
         for(int i=0;i<=71;i++){
           JButton boton=new JButton(""+i);
           boton.setForeground(Color.ORANGE);
           if(i%2==0){
             boton.setBackground(Color.BLACK);
             boton.setActionCommand("Black");
           }else{
              boton.setBackground(Color.WHITE);
               boton.setActionCommand("White");
           }  
          
          Escuchador escucha=new  Escuchador();
          boton.addActionListener(escucha);
          this.add(boton);
           
         }
       
    
    
    }
    public class Escuchador implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
              JButton boton=(JButton)e.getSource();
            if(e.getActionCommand().equals("Black")){
              JOptionPane.showMessageDialog(null,"EL color de la casilla es Negro y se entra en la posicion "+boton.getText());
            
            }else if(e.getActionCommand().equals("White")){
               JOptionPane.showMessageDialog(null,"EL color de la casilla es Blanco y se entra en la posicion "+boton.getText());
            
            
            }
            
            
            
        }
    
    
    }
    
    
    
    public static void main(String arg[]){
      Algedrez algedrez=new Algedrez();
      algedrez.setVisible(true);
    
    }
    
}
