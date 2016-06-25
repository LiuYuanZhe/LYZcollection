package net;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import entity.Frig;

public class Paging {
	private int first;
	private int last;
	private int pageCount;
	private int rowCount;
	private int pageRowCount;
	private int curPage;
	private Collection data;
	//Ĭ��3������
	public Paging(Collection data,int curPage){
		this.data = data;
		this.curPage = curPage;
		this.pageRowCount = 3;
		this.rowCount = data.size();
		this.pageCount = (int) Math.ceil(this.rowCount/this.pageRowCount);
	}
	//�Զ�����ʾ����
	public Paging(Collection data,int curPage,int pageRowCount){
		this.data = data;
		this.curPage = curPage;
		this.pageRowCount = pageRowCount;
		this.rowCount = data.size();
		this.pageCount = (int) Math.ceil(this.rowCount/this.pageRowCount);
	}
	public Paging(){}
	public int getLast(){
		return this.last = this.pageCount;
	}
	public int previous() {  
	    return (this.curPage > 1) ? this.curPage - 1 : 1;  
	}
	public int next() {
		if(this.curPage < this.pageCount){
			return this.curPage + 1;
		}
	    return this.pageCount; 
	}
	public boolean isFirst(){
		if(this.curPage==1){
			return true;
		}
		return false;
	}
	public boolean isLast(){
		if(this.curPage==this.pageCount){
			return true;
		}
		return false;
	}
	//rowcountÿҳ��ʾ���ݣ�pagecountҳ����list�����б��¼����
	public List getpageList(int rowcount,int pagecount, List<Frig> list){
		List<Object> playList = new ArrayList<Object>();
		if(list.size()<rowcount){
			for (int i = 0; i < list.size(); i++) {
				Object obj = list.get(i);
				playList.add(obj);
			}
		}else{
			for (int i = (pagecount-1)*rowcount; i < (pagecount)*rowcount; i++) {
				Object obj = list.get(i);
				playList.add(obj);
			}
		}
		return playList;
	}
	
}
