import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	//���ͼƬ
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	double x = 100;//С��ĺ�����
	double y = 100;//С���������
	boolean right = true;
	//������
	public void paint(Graphics g){
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk, 0, 30, null);
		g.drawImage(ball,(int) x, (int)y, null);
		if(right){
			x = x+10;
		}else{
			x = x-10;
		}
		
		if(x > 1219-53-40){//1219���ڿ��,53���ӱ߿��ȣ�40С��ֱ��
		right = false;
		}
		if(x<53){
			right = true;
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
		BallGame game = new BallGame();
		game.launchFrame();
	}

}
