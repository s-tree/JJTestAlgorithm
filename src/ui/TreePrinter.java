package ui;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

import javax.swing.JFrame;

import test.Tree;

public class TreePrinter {
	Tree rootTree;
	MyWindow jFrame;
	
	public static class Point{
		public int pointX,pointY;
		public Point(int x,int y){
			this.pointX = x;
			this.pointY = y;
		}
		
		public boolean isInPoint(int x,int y){
			return Math.abs(pointX - x) <= 10 && Math.abs(pointY - y) <= 10 && Math.sqrt(Math.pow(pointX - x,2) + Math.pow(pointY- y , 2)) <= 10;
		}
	}
	
	public static HashMap<Point,Tree> treeMap = new HashMap<>();
	
	// ´òÓ¡¹þ·òÂüÊ÷  
	public void printTree(Tree root) {  
	    MyWindow jf = new MyWindow();  
	    jf.addMouseListener(new MouseAdapter() {
	    	 
            public void mouseClicked(MouseEvent e) {
            	int x = e.getX();
            	int y = e.getY();
//                System.out.println("clicked");
            	Point clickPoint = null;
            	for(Point point : treeMap.keySet()){
            		if(point.isInPoint(x, y)){
            			Tree tree = treeMap.get(point);
            			tree.canDraw = !tree.canDraw;
//            			jFrame.dispose();
//            			jFrame = new MyWindow();
//            			jFrame.setSize(1200, 800);  
//            			jFrame.setVisible(true);  
//            			jFrame.setDefaultCloseOperation(3);
            			jFrame.clear();
            			drawTree(rootTree, jFrame, 600, 50, 1);
            			return;
            		}
            	}
            }
        });
	    jf.setSize(800, 800);  
	    jf.setVisible(true);  
	    jf.setDefaultCloseOperation(3);  
	    jFrame = jf;
	    this.rootTree = root;
	    drawTree(root, jf, 600, 50, 1);  
	}  
	  
	// »­¹þ·òÂüÊ÷  
	public void drawTree(Tree a, MyWindow jf, int x, int y, int level) {
	    Graphics g = jf.getGraphics();  
	    level++;  
	    if(!a.canDraw){
	    	return;
	    }
	    if (a.left == null && a.right == null) {  
	        g.drawString(String.valueOf(a.data), x, y);  
	        jf.getShapes().add(new Word(String.valueOf(a.data), x, y));  
	        System.out.println("»­Íê½Úµã" + a.data);  
	        treeMap.put(new Point(x,y), a);
	    }  
	    if (a.left != null) {  
	        g.drawLine(x, y, x - 30, y + 30);  
	        jf.getShapes().add(new Line(x, y, x - 30, y + 30));  
	        drawTree(a.left, jf, x - 30, y + 30, level);  
	    }  
	    if (a.right != null) {  
	        g.drawLine(x, y, x + 30, y + 30);  
	        jf.getShapes().add(new Line(x, y, x + 30, y + 30));  
	        drawTree(a.right, jf, x + 30, y + 30, level);  
	    }  
	}  
}
