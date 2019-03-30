package cn.wsx.collection;
/**
 * �Զ���map��������
 * 1.��߲�ѯЧ��//���ù�ϣֵ
 */
public class MyMap002 {
	MyLinkedList[] arr = new MyLinkedList[999];//map�ĵײ�ṹ������+����
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
					e2.value = value;//��ֵ�ظ�������
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
