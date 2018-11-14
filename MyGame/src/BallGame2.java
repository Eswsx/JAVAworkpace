import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
	//添加图片
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	double x = 100;//小球的横坐标
	double y = 100;//小球的纵坐标
	double degree = 3.14/3;//弧度。此处为60度
	//画窗口
	public void paint(Graphics g){
		System.out.println("窗口被画了一次");
		g.drawImage(desk, 0, 30, null);
		g.drawImage(ball,(int) x, (int)y, null);

		x = x + 10 * Math.cos(degree);
		y = y + 10 * Math.sin(degree);
		
		if(y>625 - 28 - 40 || y < 40+40){
			degree = -degree;
		}
		if(x<54||x>1219-40-54){//54窗口宽度
			degree = 3.14 - degree;
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
		BallGame2 game = new BallGame2();
		game.launchFrame();
	}

}
