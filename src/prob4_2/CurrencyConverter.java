package prob4_2;

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
		
		System.out.println("백만원은 "+toDollar(1000000)+"달러 입니다.");
		System.out.println("백달러는 "+toKWR(100)+"원 입니다.");
	}
}
