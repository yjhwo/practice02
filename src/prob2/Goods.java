package prob2;

public class Goods {
	private String product;
	private int price;
	private int num;	// 수량
	
	public Goods(){	}
	public Goods(String product, int price, int num) {
		this.product = product;
		this.price = price;
		this.num = num;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "Goods [product=" + product + ", price=" + price + ", num=" + num + "]";
	}
	
	
	
}