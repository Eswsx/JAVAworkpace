import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	//添加图片
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	double x = 100;//小球的横坐标
	double y = 100;//小球的纵坐标
	boolean right = true;
	//画窗口
	public void paint(Graphics g){
		System.out.println("窗口被画了一次");
		g.drawImage(desk, 0, 30, null);
		g.drawImage(ball,(int) x, (int)y, null);
		if(right){
			x = x+10;
		}else{
			x = x-10;
		}
		
		if(x > 1219-53-40){//1219窗口宽度,53桌子边框宽度，40小球直径
		right = false;
		}
		if(x<53){
			right = true;
		}
	}
	
	//窗口加载
	void launchFrame(){
		setSize(1219,645);
		setLocation(200,200);
		setVisible(true);
		
		//重画窗口,每秒画25次
		while(true){
			repaint();
			try{
				Thread.sleep(40);//40ms				
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] arges){
		BallGame game = new BallGame();
		game.launchFrame();
	}

}
