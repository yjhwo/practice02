package prob2;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String[] args){
		
		System.out.println("상품 3개를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String[] str = new String[3];
		
		for(int i=0; i<3; i++){
			str[i] = sc.nextLine();
		}
		// --------------------------- 초기화
		
		for(int i=0; i<str.length; i++){
			String[] line = str[i].split(" ");
			Goods g = new Goods(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]));
			System.out.println(g.getProduct()+"(가격:"+g.getPrice()+"원)이 "+g.getNum()+"개 입고 되었습니다.");
		}
		// --------------------------- 저장 및 출력
		
		
		
	}
}
