package cn.es.oop.callback;
/**
 * �ص�����
 * @author Es������
 *
 */

public class PaintFrame {
	public static void drawFrame(MyFrame f){//(IMyFrame f)
		System.out.println("�����߳�");
		System.out.println("����ѭ��");
		System.out.println("�鿴��Ϣջ");
		
		//������
		f.paint();
		
		System.out.println("�������棬����Ч��");
		
	}
	

	public static void main(String[] args) {
		drawFrame(new GameFrame02()); 
	}
}
//class GameFrame01 implements IMyFrame{
class GameFrame01 extends MyFrame{
	public void paint(){
		System.out.println("GameFrame01");
		System.out.println("������");
	}
}
//class GameFrame02 implements IMyFrame{
class GameFrame02 extends MyFrame{
	public void paint(){
		System.out.println("GameFrame02");
		System.out.println("������");
	}
}