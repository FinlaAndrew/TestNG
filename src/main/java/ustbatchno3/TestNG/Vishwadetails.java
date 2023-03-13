package ustbatchno3.TestNG;

public class Vishwadetails {
	private String Test;
	private int pricewithmaterial,pricewithout;
	public Vishwadetails(String test, int pricewithmaterial, int pricewithout) {
		super();
		Test = test;
		this.pricewithmaterial = pricewithmaterial;
		this.pricewithout = pricewithout;
	}
	public String getTest() {
		return Test;
	}
	public void setTest(String test) {
		Test = test;
	}
	public int getPricewithmaterial() {
		return pricewithmaterial;
	}
	public void setPricewithmaterial(int pricewithmaterial) {
		this.pricewithmaterial = pricewithmaterial;
	}
	public int getPricewithout() {
		return pricewithout;
	}
	public void setPricewithout(int pricewithout) {
		this.pricewithout = pricewithout;
	}
	@Override
	public String toString() {
		return "Vishwadetails [Test=" + Test + ", pricewithmaterial=" + pricewithmaterial + ", pricewithout="
				+ pricewithout + "]";
	}
	
}
