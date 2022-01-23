package book;

import java.util.Scanner;

public class Book104_106 {
	public static void main(String[] args) {
		
		int grade = 90;
//		
//		if(grade >= 60) {
//			System.out.println("축하합니다. 합격입니다.");
//			System.out.println("장학금도 받을 수 있습니다.");
//		} else {
//			System.out.println("불합격입니다.");
//			System.out.println("장학금을 받을 수 없습니다.");
//		}
		
		String a = grade >= 80  ? "합격입니다." : "불합격입니다.";
		System.out.println(a);
		
		int hours, pay;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("시간을 입력하시오 >> ");
		hours = input.nextInt();
		
		if (hours > 8) {
			pay = hours * 5000;
		} else {
			pay = (8 * 5000) + (int)( (hours-8) * 5000 * 1.5 );
		}
		
		System.out.printf("임금은  %d입니다.\n", pay);	//안배운부분!!!
		
	}
}
