package prob5;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(">> ");
		String line = null;
		line = sc.nextLine();

		do {
			String[] str = line.split(" ");
			Arith a = null;

			if (str[1].equals("+")) {
				a = new Add();
			} else if (str[1].equals("-")) {
				a = new Sub();
			} else if (str[1].equals("*")) {
				a = new Mul();
			} else if (str[1].equals("/")) {
				a = new Div();
			} else {
				System.out.println("Unknown Operator");
			}

			if (a != null) {
				a.setValue(Integer.parseInt(str[0]), Integer.parseInt(str[2]));
				System.out.println(">> " + a.calculate());
			}
			
			System.out.print(">> ");
			line = sc.nextLine();
		} while (!line.equals("quit"));

		sc.close();
	}

}
