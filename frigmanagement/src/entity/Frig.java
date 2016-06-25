package entity;

import java.util.Date;





public class Frig {
	private String zichanId;//资产id，主键
	private Date shengchanriqi;//生产日期
	private String chanpinxinghao;//产品型号
	
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
