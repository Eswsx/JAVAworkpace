package cn.es.oop.callback;
/**
 * 回调函数
 * @author Es无语中
 *
 */

public class PaintFrame {
	public static void drawFrame(MyFrame f){//(IMyFrame f)
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");
		
		//画窗口
		f.paint();
		
		System.out.println("启动缓存，增加效果");
		
	}
	

	public static void main(String[] args) {
		drawFrame(new GameFrame02()); 
	}
}
//class GameFrame01 implements IMyFrame{
class GameFrame01 extends MyFrame{
	public void paint(){
		System.out.println("GameFrame01");
		System.out.println("画窗口");
	}
}
//class GameFrame02 implements IMyFrame{
class GameFrame02 extends MyFrame{
	public void paint(){
		System.out.println("GameFrame02");
		System.out.println("画窗口");
	}
}