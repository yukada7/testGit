package gitBranchTest;

import java.util.Scanner;

public class Quiz04 {

    public static void main(String[] args) {
        // 개수를 입력 받이 0부터 입력받은 개수만큼의 피보나치수열을 출력하는 프로그램을 작성하시오.
        /*
         처리조건 : while문을 이용하여 작성한다.
                   개수의 입력은 Scanner 클래스의 nextInt() 메소드를 이용한다.
         실행결과 : 개수 ? 10
                   0 1 1 2 3 5 8 13 24
         */
        Scanner sc = new Scanner(System.in);
        int inputNum;

        System.out.print("개수 ? ");
        inputNum = sc.nextInt();

        int a = 0, b = 1;
        int c = 0;
        int cnt = 0;


        while (cnt < inputNum) {
        	if (cnt == 0) {
        		System.out.printf("%d ", a);
        	} else {
        		c = b;
        		a = a + b;
        		b = a;
        		a = c;
        		
        		System.out.print(a + " ");
        	}
        	cnt++;
        }
    }
}
