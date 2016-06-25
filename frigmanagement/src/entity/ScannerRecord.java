package entity;

import java.util.Date;

public class ScannerRecord {
	private int scannerId;//ɨ���� ����
	private String zichanId;//�ʲ����  ������ӱ����
	private String GPSAddress;//GPS��ַ����γ�ȼӵ�ַ
	private Date GPStime;//GPS��ȡʱ��
	private int jingxiaoshang;//������
	private int status;//״̬��  0������ 1����
	private String beizhu1;//��ע1
	private String beizhu2;//��ע2
	private String beizhu3;//��ע3
	private Frig frig = new Frig();
	public ScannerRecord(String zichanId, String gPSAddress,
			Date gPStime, int jingxiaoshang, int status, String beizhu1,
			String beizhu2, String beizhu3, Frig frig) {
		this.zichanId = zichanId;
		GPSAddress = gPSAddress;
		GPStime = gPStime;
		this.jingxiaoshang = jingxiaoshang;
		this.status = status;
		this.beizhu1 = beizhu1;
		this.beizhu2 = beizhu2;
		this.beizhu3 = beizhu3;
		this.frig = frig;
	}
	public ScannerRecord(){}
	public Frig getFrig() {
		return frig;
	}
	public void setFrig(Frig frig) {
		this.frig = frig;
	}
	public int getScannerId() {
		return scannerId;
	}
	public void setScannerId(int scannerId) {
		this.scannerId = scannerId;
	}
	public String getZichanId() {
		return zichanId;
	}
	public void setZichanId(String zichanId) {
		this.zichanId = zichanId;
	}
	public String getGPSAddress() {
		return GPSAddress;
	}
	public void setGPSAddress(String gPSAddress) {
		GPSAddress = gPSAddress;
	}
	public Date getGPStime() {
		return GPStime;
	}
	public void setGPStime(Date gPStime) {
		GPStime = gPStime;
	}
	public int getJingxiaoshang() {
		return jingxiaoshang;
	}
	public void setJingxiaoshang(int jingxiaoshang) {
		this.jingxiaoshang = jingxiaoshang;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getBeizhu1() {
		return beizhu1;
	}
	public void setBeizhu1(String beizhu1) {
		this.beizhu1 = beizhu1;
	}
	public String getBeizhu2() {
		return beizhu2;
	}
	public void setBeizhu2(String beizhu2) {
		this.beizhu2 = beizhu2;
	}
	public String getBeizhu3() {
		return beizhu3;
	}
	public void setBeizhu3(String beizhu3) {
		this.beizhu3 = beizhu3;
	}
}
