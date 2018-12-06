package cn.es.myCollection;
/**
 * 模拟实现JDK中的ArrayList类
 * @author Es无语中
 *
 */
public class MyArrayList {
	private Object[] value;
	private int size;
	
	public MyArrayList(){
//		value = new Object[16];
		this(10);
	}
	
	public MyArrayList(int size){
		rangCheck(size);
		value = new Object[size];
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void add(Object obj){
		value[size] = obj;
		size++;
		if(size>=value.length){
			//该扩容
			int newCapacity = value.length*2;
			Object[] newList = new Object[newCapacity];
//			System.arraycopy(src, srcPos, dest, destPos, length);
			for(int i=0;i<value.length;i++){
				newList[i] = value[i];
			}
			value = newList;
		}
	}
	
	public Object get(int index){
		rangCheck(index);
		return value[index];
	}
	
	public int indexOf(Object obj){
		if(obj == null){
			return -1;
		}else{
			for(int i=0;i<value.length;i++){
				if(obj == value[i]){
					return i;
				}
			}
			return -1;
		}
	}
	public int lastIndexOf(Object obj){
		if(obj == null){
			return -1;
		}else{
			for(int i=value.length;i>=0;i--){
				if(obj == value[i]){
					return i;
				}
			}
			return -1;
		}
	}
	
	public Object set(int index,Object object){
		rangCheck(index);
		
		Object old = value[index];
		value[index] = object;
		return old;
	}
	
	public void rangCheck(int index){
		if(size < 0){
			try{
				throw new Exception();//手动抛出异常
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add("aaa");
		list.add(new Human("xiaoming"));
		list.add("bbbb");
		
		Human h = (Human)list.get(1);
		System.out.println(h.getName());
		
		System.out.println(list.get(2));
		System.out.println(list.size());
	}
}
