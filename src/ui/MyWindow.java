package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

public class MyWindow extends JFrame{

    // ����������ͼ�ε��б�  
    ArrayList<Shape> shapes = new ArrayList<Shape>();  
  
    public ArrayList<Shape> getShapes() {  
        return shapes;  
    }  
  
    // ��д������ƴ���ķ���  
    public void paint(Graphics g) {  
        super.paint(g);  
        // �������е���״ȡ��������  
        for (int i = 0; i < shapes.size(); i++) {  
            // �����±�ȡ��һ����״����  
            Shape sh = shapes.get(i);  
            // ����  
            sh.draw(g);  
        }  
    }  
    
    public void clear(){
    	Graphics g = getGraphics();
    	g.setColor(Color.WHITE);
    	g.drawRect(0, 0, 1200, 1000);
    	g.setColor(Color.BLACK);
    }
}
