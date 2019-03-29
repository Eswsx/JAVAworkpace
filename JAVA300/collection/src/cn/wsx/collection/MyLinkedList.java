package cn.wsx.collection;

public class MyLinkedList /*implements List*/{
	private Node first;
	private Node last;
	private int size;
	
	public void add(Object obj){
		Node n = new Node();
		if(first==null){
			n.setObj(obj);
			n.setNext(null);
			first = n;
			last = n;
		}else {
			//直接往last节点后增加新的节点
			n.setPrevious(last);
			n.setObj(obj);
			n.setNext(null);
			
			last.setNext(n);
			last = n;
		}
		size++;
	}
	public int size(){
		return size;
	}
	
	public Object get(int index){
		rangeCheck(index);
		Node temp = node(index);
		if(temp!=null){
			return temp.obj;
		}
		return null;
	}
	public void remove(int index){
		Node temp = node(index);
			if(temp!=null){
				Node up = temp.previous;
				Node down = temp.next;
				up.next = down;
				down.previous = up;
		}
		size--;
	}
	public Node node(int index){
		Node temp = null;
		if(first!=null){
			temp = first;
			for(int i=0;i<index;i++){
				temp = temp.next;
			}
		}
		return temp;
	}
	
	private void rangeCheck(int index){
		if(index<0 || index>=size){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	public void add(int index,Object obj){
		Node temp = node(index);
		
		Node newNode = new Node();
		newNode.obj = obj;
		
		if(temp!= null){
			Node up = temp.previous;
			up.next = newNode;
			newNode.previous = up;
			
			newNode.next = temp;
			temp.previous = newNode;
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		list.remove(1);
		System.out.println(list.get(1));
	}
}

