package prob4;

import java.util.Scanner;

public class CurrencyConverter {

	private static double RATE = 0.;

	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환
		return won/RATE;
	}

	public static double toKWR(double dollar) {
		// 달러를 한국 원화로 변환
		return dollar*RATE;
	}

	public static void setRate(double r) {
		// 환율 설정. KWR/$1 ???
		RATE = r;
	}

	public static void main(String[] args) {
		setRate(1215.50);
		
		System.out.println("1.원화->달러	2.달러->원화");
		Scanner sc = new Scanner(System.in);
		int chk = sc.nextInt();
		
		if(chk==1){
			System.out.print("원화 입력>>");
			int won = sc.nextInt();
			System.out.println(won+"은 "+toDollar(won)+"달러 입니다.");
		}else if(chk==2){
			System.out.print("달러 입력>>");
			int dollar = sc.nextInt();
			System.out.println(dollar+"는 "+toKWR(dollar)+"원 입니다.");
		}
	}
}
