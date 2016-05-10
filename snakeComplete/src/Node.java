import java.awt.Color;
import java.awt.Graphics;


public class Node {

	private int x;
	private int y;
	
	private final int WIDTH = 10;
	private final int HEIGHT = 10;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getWIDTH() {
		return WIDTH;
	}
	public int getHEIGHT() {
		return HEIGHT;
	}
	public Node(int x, int y) {
		
		this.x = x;
		this.y = y;
	}
	public Node() {
		
	}
	
	//绘制方法
    public void draw(Graphics g){
		
		Color c = g.getColor();
		
		g.setColor(new Color(0,0,0));
		g.fillRect(x, y, WIDTH, HEIGHT);
		//g.fillArc(x, y, WIDTH, HEIGHT, 0, 360);
		
		
		g.setColor(c);
	}
	
	
}
