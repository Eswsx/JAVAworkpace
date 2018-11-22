package cn.es.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ��������
 * @author Es������
 *
 */
public class MyGameFrame extends JFrame {
	/**
	 * ��ʼ������
	 */
	public void launchFrame(){
		this.setTitle("Es������");//���ô�����
		this.setVisible(true);//���ô��ڿɼ�
		this.setSize(500,500);//���ڳߴ�
		this.setLocation(300,300);//���ô���λ��
		
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {//�������ڹر�
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args){
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
