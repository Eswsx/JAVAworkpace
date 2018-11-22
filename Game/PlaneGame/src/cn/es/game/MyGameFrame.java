package cn.es.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author Es无语中
 *
 */
public class MyGameFrame extends JFrame {
	/**
	 * 初始化窗口
	 */
	public void launchFrame(){
		this.setTitle("Es无语中");//设置窗口名
		this.setVisible(true);//设置窗口可见
		this.setSize(500,500);//窗口尺寸
		this.setLocation(300,300);//设置窗口位置
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {//监听窗口关闭
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args){
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
