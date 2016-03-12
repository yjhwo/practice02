package prob5;

public abstract class Arith {
	protected int a;
	protected int b;
	// 자식 클래스에서도 사용 가능 하도록
	
	public Arith() { }

	public Arith(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public void setValue(int a, int b){
		this.a = a;
		this.b = b;
	}
	public abstract int calculate();
	// 자식 클래스들 보고 구현하라고
}
