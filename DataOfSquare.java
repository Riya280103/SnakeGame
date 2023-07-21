package com.mycompany.game;
import java.util.ArrayList;
import java.awt.Color;

public class DataOfSquare {
    ArrayList<Color> C=new ArrayList<Color>(); //contains color
    int color;
    SquarePanel square;
    public DataOfSquare(int col){
        C.add(Color.DARK_GRAY);
        C.add(Color.WHITE);
        C.add(Color.LIGHT_GRAY);
        color=col;
        square = new SquarePanel(C.get(color));     
    }
    public void lightMeUp(int c){
        square.ChangeColor(C.get(c));
    }
}
