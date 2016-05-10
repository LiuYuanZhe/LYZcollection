import java.util.ArrayList;
import java.util.Random;



public class Snake {
	
	private static Snake snake = null;
	
	//蛇的身体
	private ArrayList<Node> snakeNood = new ArrayList<Node>();
	//方向属性
	private int dir = Direction.RIGHT;
	//食物篮子
	private ArrayList<Node> foodList = new ArrayList<Node>();
	
	private boolean isLive = true;
	
	private boolean isPause = false;
	
	
	
	
	public boolean isPause() {
		return isPause;
	}

	public void setPause(boolean isPause) {
		this.isPause = isPause;
	}

	public boolean isLive() {
		return isLive;
	}

	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}

	public ArrayList<Node> getFoodList() {
		return foodList;
	}

	public void setFoodList(ArrayList<Node> foodList) {
		this.foodList = foodList;
	}

	private Random r = new Random();
	

	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public ArrayList<Node> getSnakeNood() {
		return snakeNood;
	}

	public void setSnakeNood(ArrayList<Node> snakeNood) {
		this.snakeNood = snakeNood;
	}
	
	private Snake(){
		
		addFood();
		snakeNood.add(0,new Node(30,50));
		snakeNood.add(0,new Node(40,50));
		snakeNood.add(0,new Node(50,50));
	}
	
	public static Snake getSnake(){
		if(snake == null){
			synchronized (Snake.class) {
				snake = new Snake();
			}
		}
		return snake;
	}
	
	
	public void addFood(){
		
		int x=10*r.nextInt(30)+30;
		int y=10*r.nextInt(30)+50;
		
		for(int i=0;i<snakeNood.size();i++){
			if(x == snakeNood.get(i).getX() && y == snakeNood.get(i).getY()){
				x=10*r.nextInt((29)+1)+30;
				y=10*r.nextInt((29)+1)+50;
				i = 0;
				continue;
			}
		}
		
		Node node1=new Node(x,y);
		
		foodList.add(0,node1);
	}
	
	
	public boolean eatFood(){
		Node head = snakeNood.get(0);
		Node food = foodList.get(0);
		
		  if(dir == Direction.RIGHT && (head.getX()+10) == food.getX() && head.getY() == food.getY() ){
			  return true;
		  }
		  if(dir == Direction.LEFT && (head.getX()-10) == foodList.get(0).getX() && head.getY() == foodList.get(0).getY() ){
			  return true;
		  }
		  if(dir == Direction.UP && head.getX()== foodList.get(0).getX() && (head.getY()-10) == foodList.get(0).getY() ){
			  return true;
		  }
		  if(dir == Direction.DOWN && head.getX() == foodList.get(0).getX() && (head.getY()+10) == foodList.get(0).getY() ){
			  return true;
		  }
		  else{
			 return false;  
		  } 
		
	}
	
	
	public boolean isDeath(){
		
		int x = 0, y = 0;
		
		if((dir == Direction.RIGHT && snakeNood.get(0).getX() == 320) ||
		   (dir == Direction.LEFT && snakeNood.get(0).getX() == 30) ||
		   (dir == Direction.UP && snakeNood.get(0).getY() == 50) ||
		   (dir == Direction.DOWN && snakeNood.get(0).getY() == 340)){
			return true;
		}
		
		for(int i=3;i<snakeNood.size();i++){
			x = snakeNood.get(0).getX();
			y = snakeNood.get(0).getY();
			
			if(x == snakeNood.get(i).getX() && y == snakeNood.get(i).getY()){
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	//蛇的下一个运动位置，类似于连续的电影胶片
	public void move(){
		
		if(isDeath()){
			isLive = false;
			return;
		}

		if(eatFood()){
			Node node = foodList.get(0);
			snakeNood.add( node);
			addFood();
			foodList.remove(foodList.size()-1);	
		}
		
		
		int x = snakeNood.get(0).getX();
		int y = snakeNood.get(0).getY();
		
		
		switch(dir){
		case Direction.LEFT:
			x = x - 10;
			break;
		case Direction.RIGHT:
			x = x + 10;
			break;
		case Direction.UP:
			y = y - 10;
			break;
		case Direction.DOWN:
			y = y + 10;
			break;
		}
		
		//根据 dir  求   x  y
		
	    Node newHead = new Node(x, y);
	    snakeNood.add(0, newHead);
	    snakeNood.remove(snakeNood.size()-1);
		
	}

}
