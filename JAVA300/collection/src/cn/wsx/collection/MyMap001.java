package cn.wsx.collection;
/**
 * �Զ���ʵ��MAP�Ĺ���
 * �ݲ�����
 * MAp����ż�ֵ�ԣ����ݼ������Ҷ�Ӧ��ֵ����,�������ظ�
 * @author Es������
 *
 */
public class MyMap001 {
	
	MyEntry[] arr = new MyEntry[990];
	int size;
	
	public void put(Object key,Object value){
		MyEntry e = new MyEntry(key, value);
		
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				arr[i].value = value;
				return;
			}//�����ֵ����ͬ���⣬���и���
		}
		arr[size++] = e;
	}
	public Object get(Object key){
		for(int i=0;i<size;i++){
			if(arr[i].key.equals(key)){
				return arr[i].value;
			}
		}
		return null;
	}
	public boolean containsKey(Object value){
		for(int i=0;i<size;i++){
			if(arr[i].value.equals(value)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		MyMap001 m = new MyMap001();
		m.put("123", new wife("567"));
		m.put("123", new wife("2222"));
		wife w = (wife) m.get("123");
		System.out.println(w.name);
	}
}

class MyEntry{
	Object key;
	Object value;
	
	public MyEntry(Object key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
	
}