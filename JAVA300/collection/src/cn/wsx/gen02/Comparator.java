package cn.wsx.gen02;
/**
 * 接口中 泛型字母只能使用在方法中，不能使用在全局常量中
 * @author Es无语中
 *
 * @param <T>
 */
public interface Comparator <T>{
	void compare(T t);
}
