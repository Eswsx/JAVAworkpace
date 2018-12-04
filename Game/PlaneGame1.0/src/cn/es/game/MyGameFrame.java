package cn.es.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ��������
 * @author Es������
 *
 */
public class MyGameFrame extends Frame {
	//����˫���弼��
	private Image offScreenImage = null;
	
	public void update(Graphics g){
		if(offScreenImage == null){
			offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//��Ϸ���ڵĿ��Ⱥ͸߶�
		}
		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
//		System.out.println(1);
	}
	//
	Image bg = GameUtil.getImage("Images/bg.png");
	Image planeImg = GameUtil.getImage("Images/plane.png");
	
	Plane plane = new Plane(planeImg,250,250);
	Shell[] shells = new Shell[50]; 
	
	Explode bao;
	Date startTime = new Date();
	Date endTime;
	int period;//��Ϸ����ʱ��
	
	@Override
	public void paint(Graphics g) {//�Զ������� g�൱��һֻ����
		Color c = g.getColor();
		g.drawImage(bg, 0, 0, null);

		plane.drawSelf(g);//���ɻ�
		//�������ڵ�
		
		for(int i=0;i<shells.length;i++){
			shells[i].draw(g);
			//�ɻ����ڵ�����ײ���
			boolean peng = shells[i].getRect().intersects(plane.getRect());
			if(peng){
				plane.live = false;
//			System.out.println("��ײ����");
				if(bao == null){
				bao = new Explode(plane.x,plane.y);
				
				endTime = new Date();
				period = (int)((endTime.getTime() - startTime.getTime())/1000);
				}
				bao.draw(g);
			}
			//��ʱ���ܸ�����ʾ
				if(!plane.live){
					Font f = new Font("����",Font.BOLD,50);
					g.setColor(Color.red);
					g.setFont(f);
					g.drawString("ʱ�䣺"+period+"��", 100, 100);
					}
			
			
		}
		g.setColor(c);
//		shell.draw(g);

	}
	
	//�������Ƿ����ػ�����
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true){
//				System.out.println("���ڻ�һ��");
				repaint();//�ػ�
				
				try {
					Thread.sleep(40);//1s = 1000ms
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
	//������̼������ڲ���
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
//			 System.out.println("���£�" + e.getKeyCode());
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
//			System.out.println("̧��" + e.getKeyCode());
			plane.minusDirection(e);
		}
		
	}
	
	
	
	/**
	 * ��ʼ������
	 */
	public void launchFrame(){
		this.setTitle("Es������");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH+8,Constant.GAME_HEIGHT+8);//Ϊ��������ʾ�����ʼ�8
		this.setLocation(300,300);
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();//�����ػ����ڵ��߳�
		addKeyListener(new KeyMonitor());//���������Ӽ��̼���
		
		//��ʼ��50���ڵ�
		for(int i=0;i<shells.length;i++){
			shells[i] = new Shell();
		}
	}
	
	public static void main(String[] args){////////////////////////////////////////////////////
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}