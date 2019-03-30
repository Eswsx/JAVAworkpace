package cn.wsx.collection;
/**
 * 自定义实现MAP的功能
 * 暂不完美
 * MAp：存放键值对，根据键对象找对应的值对象,键不能重复
 * @author Es无语中
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
			}//解决键值对相同问题，进行覆盖
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