/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;
import java.awt.Color;
import javax.swing.JPanel;
    public class SquarePanel extends JPanel{
        private static final long serialVersionUID = 1L;
        public SquarePanel(Color d){
            this.setBackground(d);
        }
        
        public void ChangeColor(Color d){
            this.setBackground(d);
            this.repaint();
        }
    }

