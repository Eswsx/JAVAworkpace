import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {
	//���ͼƬ
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	double x = 100;//С��ĺ�����
	double y = 100;//С���������
	double degree = 3.14/3;//���ȡ��˴�Ϊ60��
	//������
	public void paint(Graphics g){
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk, 0, 30, null);
		g.drawImage(ball,(int) x, (int)y, null);

		x = x + 10 * Math.cos(degree);
		y = y + 10 * Math.sin(degree);
		
		if(y>625 - 28 - 40 || y < 40+40){
			degree = -degree;
		}
		if(x<54||x>1219-40-54){//54���ڿ��
			degree = 3.14 - degree;
		}
		
		
	}
	
	//���ڼ���
	void launchFrame(){
		setSize(1219,645);
		setLocation(200,200);
		setVisible(true);
		
		//�ػ�����,ÿ�뻭25��
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
