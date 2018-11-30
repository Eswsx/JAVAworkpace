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
 * 飞机游戏的主窗口
 * @author Es无语中
 *
 */
public class MyGameFrame extends JFrame {
	//添加双缓冲技术
	private Image offScreenImage = null;
	
	public void update(Graphics g){
		if(offScreenImage == null){
			offScreenImage = this.createImage(500,500);//游戏窗口的宽度和高度
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

	
	@Override
	public void paint(Graphics g) {//自动被调用 g相当于一只画笔
		g.drawImage(bg, 0, 0, null);

		plane.drawSelf(g);//画飞机


	}
	
	//帮助我们反复重画窗口
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true){
//				System.out.println("窗口画一次");
				repaint();//重画
				
				try {
					Thread.sleep(40);//1s = 1000ms
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
	//定义键盘监听的内部类
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
//			 System.out.println("按下：" + e.getKeyCode());
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
//			System.out.println("抬起：" + e.getKeyCode());
			plane.minusDirection(e);
		}
		
	}
	
	
	
	/**
	 * 初始化窗口
	 */
	public void launchFrame(){
		this.setTitle("Es无语中");
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocation(300,300);
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();//启动重画窗口的线程
		addKeyListener(new KeyMonitor());//给窗口增加键盘监听
	}
	
	public static void main(String[] args){
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
