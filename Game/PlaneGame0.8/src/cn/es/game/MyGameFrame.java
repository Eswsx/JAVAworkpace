package cn.es.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ��������
 * @author Es������
 *
 */
public class MyGameFrame extends JFrame {
	//���˫���弼��
	private Image offScreenImage = null;
	
	public void update(Graphics g){
		if(offScreenImage == null){
			offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//��Ϸ���ڵĿ�Ⱥ͸߶�
		}
		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
		System.out.println(1);
	}
	//
	Image bg = GameUtil.getImage("Images/bg.png");
	Image planeImg = GameUtil.getImage("Images/plane.png");
	
	Plane plane = new Plane(planeImg,250,250);
	Shell shell = new Shell();
	
	@Override
	public void paint(Graphics g) {//�Զ������� g�൱��һֻ����
		g.drawImage(bg, 0, 0, null);

		plane.drawSelf(g);//���ɻ�
		
		shell.draw(g);

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
		this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		this.setLocation(300,300);
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();//�����ػ����ڵ��߳�
		addKeyListener(new KeyMonitor());//���������Ӽ��̼���
	}
	
	public static void main(String[] args){////////////////////////////////////////////////////
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
