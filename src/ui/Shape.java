package ui;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	  
    private Color c;//��ɫ  
      
      
    public void setColor(Color c){  
        this.c = c;  
    }  
      
    public Color getColor(){  
        return c;  
    }  
    /** 
     * ���Ƶķ��� 
     * @param g 
     */  
    public abstract void draw(Graphics g);  
}
