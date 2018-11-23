package cn.es.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author Es无语中
 *
 */
public class MyGameFrame extends JFrame {
	
	Image bg = GameUtil.getImage("Images/bg.png");
	Image plane = GameUtil.getImage("Images/plane.png");
	
	int planeX = 250;
	int planeY = 250;
	
	@Override
	public void paint(Graphics g) {//自动被调用 g相当于一只画笔
		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, planeX, planeY, null);
		planeX++;
		

	}
	
	//帮助我们反复重画窗口
	class PaintThread extends Thread{
		@Override
		public void run() {
			while(true){
				System.out.println("窗口画一次");
				repaint();//重画
				
				try {
					Thread.sleep(40);//1s = 1000ms
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
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
	}
	
	public static void main(String[] args){
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
