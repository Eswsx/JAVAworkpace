package cn.es.oop.testInterface;
/*
 *接口多继承
 */
public interface InterfaceA {
	void aaa();
}

interface InterfaceB {
	void bbb();
}

interface InterfaceC extends InterfaceA,InterfaceB {
	void ccc();
}
class Test implements InterfaceC{

	@Override
	public void aaa() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void bbb() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void ccc() {
		// TODO 自动生成的方法存根
		
	}
	
}