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
	
	//时间降序+点击量升序+标题降序
	public int compareTo(NewsItem o) {
		int result = 0;
		result = -this.pubTime.compareTo(o.pubTime);//降序
		if(0==result){//时间相同
			//点击量
			result = this.hite-o.hite;//升序
			if(0==result){//点击量
				//标题
				result=this.title.compareTo(o.title);
			}
		}
		return 0;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("标题：").append(this.title);
		sb.append(",时间：").append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(this.pubTime));
		sb.append(",点击量：").append(this.hite).append("\n");
		return sb.toString();
		
	}
	
	
}
