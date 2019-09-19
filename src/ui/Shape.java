package ui;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	  
    private Color c;//颜色  
      
      
    public void setColor(Color c){  
        this.c = c;  
    }  
      
    public Color getColor(){  
        return c;  
    }  
    /** 
     * 绘制的方法 
     * @param g 
     */  
    public abstract void draw(Graphics g);  
}
