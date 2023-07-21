/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.game;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class KeyboardListener extends KeyAdapter{
    public void KeyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case 39: 
                if(ThreadsController.directionSnake !=2)
                    ThreadsController.directionSnake=1;
                break;
                
            case 38:
                 if(ThreadsController.directionSnake !=4)
                    ThreadsController.directionSnake=3;
                break;
                
            case 37:
                 if(ThreadsController.directionSnake !=1)
                    ThreadsController.directionSnake=2;
                break;
                
            case 40:
                 if(ThreadsController.directionSnake !=3)
                    ThreadsController.directionSnake=4;
                break;    
                
            default:    break;
        }
    }
}
