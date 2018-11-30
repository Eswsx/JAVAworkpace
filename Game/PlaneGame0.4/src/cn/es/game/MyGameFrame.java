package cn.es.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
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
			offScreenImage = this.createImage(500,500);//��Ϸ���ڵĿ�Ⱥ͸߶�
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
	Plane plane2 = new Plane(planeImg,250,350);
	Plane plane3 = new Plane(planeImg,250,450);
	
	@Override
	public void paint(Graphics g) {//�Զ������� g�൱��һֻ����
		g.drawImage(bg, 0, 0, null);

		plane.drawSelf(g);//���ɻ�
		plane2.drawSelf(g);
		plane3.drawSelf(g);

	}
	
	//�������Ƿ����ػ�����
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true){
				System.out.println("���ڻ�һ��");
				repaint();//�ػ�
				
				try {
					Thread.sleep(40);//1s = 1000ms
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
	/**
	 * ��ʼ������
	 */
	public void launchFrame(){
		this.setTitle("Es������");
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(300,300);
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();//�����ػ����ڵ��߳�
	}
	
	public static void main(String[] args){
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
