package cn.es.oop.testInterface;
/*
 *�ӿڶ�̳�
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
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void bbb() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void ccc() {
		// TODO �Զ����ɵķ������
		
	}
	
}