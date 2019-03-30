package cn.wsx.collection;
/**
 * 自定义map的升级版
 * 1.提高查询效率//利用哈希值
 */
public class MyMap002 {
	MyLinkedList[] arr = new MyLinkedList[999];//map的底层结构：数组+链表
	int size;
	
	public void put(Object key,Object value){
		MyEntry e = new MyEntry(key, value);
		int a = key.hashCode()%arr.length;
		if(arr[a]==null){
			MyLinkedList list = new MyLinkedList();
			arr[a] = list;
			list.add(e);
		}else{
			MyLinkedList list = arr[a];
			for(int i=0;i<list.size();i++){
				MyEntry e2 = (MyEntry) list.get(i);
				if(e2.key.equals(key)){
					e2.value = value;//键值重复，覆盖
					return;
				}
			}
			arr[a].add(e);
		}
	}
	public Object get(Object key){
//		return arr[key.hashCode()%999];
		int a = key.hashCode()%arr.length;
		System.out.println(hashCode());
		if(arr[a]!=null){
			MyLinkedList list = arr[a];
			for(int i=0;i<list.size();i++){
				MyEntry e = (MyEntry) list.get(i);
				if(e.key.equals(key)){
					return e.value;
				}
			}
		}
		return null;
	}
	
	
	public static void main(String[] args) {
		MyMap002 m = new MyMap002();
		m.put("123", new wife("567"));
		m.put("123", new wife("2222"));
		wife w = (wife) m.get("123");
		System.out.println(w.name);
	}
}
