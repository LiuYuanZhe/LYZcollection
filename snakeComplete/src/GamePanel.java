import java.awt.Color;
import java.awt.Graphics;
/*
 * 完成背景格的绘制
 */

public class GamePanel {
	
	public void draw(Graphics g){
		
		Color c = g.getColor();
		
		g.setColor(Color.DARK_GRAY);
		g.drawRect(30, 50, 300, 300);
		g.setColor(Color.GRAY);
		
//		for(int i=40; i<330; i+=300) {
//			g.drawLine(i, 50, i, 350);
//		}
//		for(int j=60; j<350; j+=250) {
//			g.drawLine(30, j, 330, j);
//		}
//		
//		g.setColor(c);
	}

}
