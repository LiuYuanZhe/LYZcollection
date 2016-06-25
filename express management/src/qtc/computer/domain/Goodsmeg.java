package qtc.computer.domain;

public class Goodsmeg {
	private int id;
	private String goodsName;
	private String goodsNumber;
	private String goodsUnit;
	private String startProvince;
	private String startCity;
	private String endProvince;
	private String endCity;
	private String transportTime;
	private String transportStyle;
	private String linkPhoe;
	private String linkMan;
	private String isGo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(String goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public String getGoodsUnit() {
		return goodsUnit;
	}
	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}
	public String getStartProvince() {
		return startProvince;
	}
	public void setStartProvince(String startProvince) {
		this.startProvince = startProvince;
	}
	public String getStartCity() {
		return startCity;
	}
	public void setStartCity(String startCity) {
		this.startCity = startCity;
	}
	public String getEndProvince() {
		return endProvince;
	}
	public void setEndProvince(String endProvince) {
		this.endProvince = endProvince;
	}
	public String getEndCity() {
		return endCity;
	}
	public void setEndCity(String endCity) {
		this.endCity = endCity;
	}
	public String getTransportTime() {
		return transportTime;
	}
	public void setTransportTime(String transportTime) {
		this.transportTime = transportTime;
	}
	public String getTransportStyle() {
		return transportStyle;
	}
	public void setTransportStyle(String transportStyle) {
		this.transportStyle = transportStyle;
	}
	public String getLinkPhoe() {
		return linkPhoe;
	}
	public void setLinkPhoe(String linkPhoe) {
		this.linkPhoe = linkPhoe;
	}
	public String getLinkMan() {
		return linkMan;
	}
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}
	public String getIsGo() {
		return isGo;
	}
	public void setIsGo(String isGo) {
		this.isGo = isGo;
	}
	public Goodsmeg() {
		
	}
	public Goodsmeg(int id, String goodsName, String goodsNumber,
			String goodsUnit, String startProvince, String startCity,
			String endProvince, String endCity, String transportTime,
			String transportStyle, String linkPhoe, String linkMan, String isGo) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.goodsNumber = goodsNumber;
		this.goodsUnit = goodsUnit;
		this.startProvince = startProvince;
		this.startCity = startCity;
		this.endProvince = endProvince;
		this.endCity = endCity;
		this.transportTime = transportTime;
		this.transportStyle = transportStyle;
		this.linkPhoe = linkPhoe;
		this.linkMan = linkMan;
		this.isGo = isGo;
	}
}
