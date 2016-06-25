package qtc.computer.domain;

public class Carmessage {
	private int id;
	private String tradeMark;
	private String brand;
	private String style;
	private String carLoad;
	private String driverName;
	private String licenseNumber;
	private String linkPhone;
	private String isGo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTradeMark() {
		return tradeMark;
	}
	public void setTradeMark(String tradeMark) {
		this.tradeMark = tradeMark;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getCarLoad() {
		return carLoad;
	}
	public void setCarLoad(String carLoad) {
		this.carLoad = carLoad;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getLinkPhone() {
		return linkPhone;
	}
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	public String getIsGo() {
		return isGo;
	}
	public void setIsGo(String isGo) {
		this.isGo = isGo;
	}
    public Carmessage() {
		
	}
	public Carmessage(int id, String tradeMark, String brand, String style,
			String carLoad, String driverName, String licenseNumber,
			String linkPhone, String isGo) {
		super();
		this.id = id;
		this.tradeMark = tradeMark;
		this.brand = brand;
		this.style = style;
		this.carLoad = carLoad;
		this.driverName = driverName;
		this.licenseNumber = licenseNumber;
		this.linkPhone = linkPhone;
		this.isGo = isGo;
	}
	
	
	

}
