package gitBranchTest;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("금액 ? ");

		int price = sc.nextInt();

		int oMan = 0;
		int man = 0;
		int oCun = 0;
		int cun = 0;
		int oBack = 0;
		int back = 0;
		int oShip = 0;
		int ship = 0;
		int o = 0;
		int i = 0;

		while (true) {
			oMan = price / 50000;
			price %= 50000;
			System.out.printf("50000원 권 / 개수 : %d", oMan);
			System.out.println();

			man = price / 10000;
			price %= 10000;
			System.out.printf("10000원 권 / 개수 : %d", man);
			System.out.println();

			oCun = price / 5000;
			price %= 5000;
			System.out.printf("5000원 권 / 개수 : %d", oCun);
			System.out.println();

			cun = price / 1000;
			price %= 1000;
			System.out.printf("1000원 권 / 개수 : %d", cun);
			System.out.println();

			oBack = price / 500;
			price %= 500;
			System.out.printf("500원 권 / 개수 : %d", oBack);
			System.out.println();

			back = price / 100;
			price %= 100;
			System.out.printf("100원 권 / 개수 : %d", back);
			System.out.println();

			oShip = price / 50;
			price %= 50;
			System.out.printf("50원 권 / 개수 : %d", oShip);
			System.out.println();

			ship = price / 10;
			price %= 10;
			System.out.printf("50원 권 / 개수 : %d", ship);
			System.out.println();

			o = price / 5;
			price %= 5;
			System.out.printf("5원 권 / 개수 : %d", o);
			System.out.println();

			i = price / 1;
			price %= 1;
			System.out.printf("1원 권 / 개수 : %d", i);
			System.out.println();

			break;
		}

		sc.close();
	}

}
