package entity;

import java.util.Date;





public class Frig {
	private String zichanId;//�ʲ�id������
	private Date shengchanriqi;//��������
	private String chanpinxinghao;//��Ʒ�ͺ�
	
	public String getZichanId() {
		return zichanId;
	}
	public void setZichanId(String zichanId) {
		this.zichanId = zichanId;
	}
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	public String getChanpinxinghao() {
		return chanpinxinghao;
	}
	public void setChanpinxinghao(String chanpinxinghao) {
		this.chanpinxinghao = chanpinxinghao;
	}
	public Frig(String zichanId, Date shengchanriqi, String chanpinxinghao) {
		this.zichanId = zichanId;
		this.shengchanriqi = shengchanriqi;
		this.chanpinxinghao = chanpinxinghao;
	}
	public Frig(Date shengchanriqi, String chanpinxinghao) {
		this.shengchanriqi = shengchanriqi;
		this.chanpinxinghao = chanpinxinghao;
	}
	public Frig( String chanpinxinghao) {
		this.chanpinxinghao = chanpinxinghao;
	}
	public Frig(){}
}
