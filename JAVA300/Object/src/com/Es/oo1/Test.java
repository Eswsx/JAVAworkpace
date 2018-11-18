package com.Es.oo1;

//import com.Es.oo.User;//1.表示导入了User类
import com.Es.oo.*;//*表示通配符，将包里所有内容导入，会降低编译速度，不会降低运行速度

public class Test {
	public static void main(String[] args){
//		com.Es.oo.User user = new com.Es.oo.User();//2.直接寻找使用
		User user = new User();
	}
}
