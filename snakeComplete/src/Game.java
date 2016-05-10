import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Game extends Frame{//定义的画图纸张
	
	Snake snake = Snake.getSnake();
	
	
	@Override
	public void paint(Graphics g) {//完成绘图的操作
		// TODO Auto-generated method stub
		//所有的内容都是在这里画
		
		g.drawString("得分：" + ((snake.getSnakeNood().size()-3)*10), 370, 80);
		if(snake.isLive()) {
			if(snake.isPause()) {
				g.drawString("状态：" + "暂停游戏", 370, 100);
			} else {
				g.drawString("状态：" + "运行 中", 370, 100);
			}
		}
		else {
			g.drawString("状态：" + "游戏结束", 370, 100);
		}
		g.drawString("项目版本：v1.0", 370, 140);
		g.drawString("作者：计算机应用3+2 1班", 400, 300);

		
		new GamePanel().draw(g);
		
		for(int i=0;i<snake.getSnakeNood().size();i++){
			snake.getSnakeNood().get(i).draw(g);
		}
		
		for(int j=0;j<snake.getFoodList().size();j++){
			snake.getFoodList().get(j).draw(g);
		}
		
		
		
	}
	
	
	Image offScreenImage = null;
	public void update(Graphics g) {
		if(offScreenImage == null) {
			offScreenImage = this.createImage(600, 400);
		}
		Graphics gOffScreen = offScreenImage.getGraphics();
		Color c = gOffScreen.getColor();
		gOffScreen.setColor(Color.GREEN);
		gOffScreen.fillRect(0, 0, 600, 400);
		gOffScreen.setColor(c);
		paint(gOffScreen);
		g.drawImage(offScreenImage, 0, 0, null);
	}
	
	
	public Game(){
		this.setTitle("我的贪吃蛇");
		this.setBounds(100, 100, 600, 400);
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}	
		});
		
		
		
		//按键的处理
		this.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent k) {
				// TODO Auto-generated method stub
				switch(k.getKeyCode()){
				case KeyEvent.VK_LEFT:					
					if(snake.getDir() == Direction.RIGHT){
						break;
					}
					snake.setDir(Direction.LEFT);
					break;
				case KeyEvent.VK_RIGHT:
					if(snake.getDir() == Direction.LEFT){
						break;
					}
					snake.setDir(Direction.RIGHT);
					break;
				
				case KeyEvent.VK_UP:
					if(snake.getDir() == Direction.DOWN){
						break;
					}
					snake.setDir(Direction.UP);
					break;
				
				case KeyEvent.VK_DOWN:
					if(snake.getDir() == Direction.UP){
						break;
					}
					snake.setDir(Direction.DOWN);
					break;
				case KeyEvent.VK_SPACE:
					if(snake.isPause()){
						snake.setPause(false);
					}else{
						snake.setPause(true);
					}
					break;
				}
			}
		});
		
		
		this.addMouseListener(null);
		
		
		
		//开始播放电影
		new Thread(new PaintThread()).start();
		
		System.out.println(snake.hashCode());
	}



	public static void main(String args[]){
		new Game().setVisible(true);
		
	}
	
	//播放放映机的那个人，蛇运动的线程
	class PaintThread implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			while(true){
				
				if(snake.isLive() && !snake.isPause()){
					snake.move();
				}
				repaint();
				
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
		
	}
	
	
	
	
	
	
}
