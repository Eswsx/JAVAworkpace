package cn.wsx.sort.refType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import cn.wsx.sort.innerType.Utils;

/**
 * ʹ��collections
 * @author Es������
 *
 */
public class NewsItemApp {
	public static void main(String[] args) {
		List<NewsItem> news = new ArrayList<>();
		news.add(new NewsItem("mjfdcfdfdfdasddsd",50,new Date(System.currentTimeMillis()-1000*60*60)));
		news.add(new NewsItem("xjfdcfsdsdsdsdd",600,new Date(System.currentTimeMillis()+1000*60*60)));
		news.add(new NewsItem("zjnhbvcxxx,sdsd,sdsd",100,new Date()));
		System.out.println("����ǰ��"+news);
		
//		Collections.sort(news);
		Utils.sort(news);
		System.out.println("�����"+news);
	}
}
