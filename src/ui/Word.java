package ui;

import java.awt.Graphics;

public class Word extends Shape{
	String data;  
    int x;  
    int y;  
  
    public Word(String data, int x, int y) {  
        this.data = data;  
        this.x = x;  
        this.y = y;  
    }  
  
    @Override  
    public void draw(Graphics g) {  
        // TODO Auto-generated method stub  
        g.setColor(this.getColor());  
        g.drawString(data, x-5, y+10);  
    }  
}
