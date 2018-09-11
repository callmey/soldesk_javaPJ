package exam_05;


public class HandPhone{
    private String productName;
    private String productType;
    private int price;
    private int phoneNumber;
    
    HandPhone() {} // framework 사용 시 기본 생성자 만들기 
    
    
	public HandPhone(String productName, String productType, int price, int phoneNumber) {
		super(); // Object를 상속하는 것.(모든 클래스를 상속함) 생략가능.
		this.productName = productName;
		this.productType = productType;
		this.price = price;
		this.phoneNumber = phoneNumber;
	} // source - constructor using field 로 생성


	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
