package cn.wsx.sort.refType;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class NewsItem implements java.lang.Comparable<NewsItem>{
	private String title;
	private int hite;
	private Date pubTime;
	public NewsItem(){
		
	}
	public NewsItem(String title, int hite, Date pubTime) {
		super();
		this.title = title;
		this.hite = hite;
		this.pubTime = pubTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getHite() {
		return hite;
	}
	public void setHite(int hite) {
		this.hite = hite;
	}
	public Date getPubTime() {
		return pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}
	
	//ʱ�併��+���������+���⽵��
	public int compareTo(NewsItem o) {
		int result = 0;
		result = -this.pubTime.compareTo(o.pubTime);//����
		if(0==result){//ʱ����ͬ
			//�����
			result = this.hite-o.hite;//����
			if(0==result){//�����
				//����
				result=this.title.compareTo(o.title);
			}
		}
		return 0;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("���⣺").append(this.title);
		sb.append(",ʱ�䣺").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
		sb.append(",�������").append(this.hite).append("\n");
		return sb.toString();
		
	}
	
	
}
