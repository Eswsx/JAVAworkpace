/**
 * 
 * 构造函数
 * @author Es无语中
 *
 */
class Point {
	double x,y,z;
	
	//构造函数和类名必须保持一致
	public Point(double _x,double _y){
		x = _x;
		y = _y;
	}
	Point(double x,double y,double z){
		this(x,y);
		this.z = z;
		 
	}

	public double getDistance(Point p){
		return Math.sqrt((x - p.x * (x - p.x) + (y - p.y) * (y - p.y)));
	}
}


public class TestConstructor{
	public static void main(String[] args){
		Point p = new Point(3.0,4.0);
		Point origin = new Point(0.0,0.0);
		System.out.println(p.getDistance(origin));
	}
}