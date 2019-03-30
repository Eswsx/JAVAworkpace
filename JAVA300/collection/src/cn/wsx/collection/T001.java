package cn.wsx.collection;

public class T001 {
	int a=0;
	String b;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		T001 other = (T001) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
}
