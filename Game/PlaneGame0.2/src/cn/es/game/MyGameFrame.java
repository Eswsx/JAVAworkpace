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
	
	Image ball = GameUtil.getImage("Images/ball.png");
	
	@Override
	public void paint(Graphics g) {//自动被调用 g相当于一只画笔
		Color c = g.getColor();
		Font f = g.getFont();
		
		g.setColor(Color.BLUE);
		g.drawLine(100,100,300,300);
		g.drawRect(100,100,300,300);
		g.drawOval(100, 100, 300, 300);
		g.fillRect(100, 100, 40, 40);
		g.setColor(Color.red);
		g.setFont(new Font("宋体",Font.BOLD,50));
		g.drawString("我是谁？？", 200, 200);
		
		g.drawImage(ball,250,250,null);
		
		g.setColor(c);
		g.setFont(f);
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
	}
	
	public static void main(String[] args){
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
