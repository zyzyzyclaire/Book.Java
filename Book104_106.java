package book;

import java.util.Scanner;

public class Book104_106 {
	public static void main(String[] args) {
		
		int grade = 90;
//		
//		if(grade >= 60) {
//			System.out.println("�����մϴ�. �հ��Դϴ�.");
//			System.out.println("���бݵ� ���� �� �ֽ��ϴ�.");
//		} else {
//			System.out.println("���հ��Դϴ�.");
//			System.out.println("���б��� ���� �� �����ϴ�.");
//		}
		
		String a = grade >= 80  ? "�հ��Դϴ�." : "���հ��Դϴ�.";
		System.out.println(a);
		
		int hours, pay;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�ð��� �Է��Ͻÿ� >> ");
		hours = input.nextInt();
		
		if (hours > 8) {
			pay = hours * 5000;
		} else {
			pay = (8 * 5000) + (int)( (hours-8) * 5000 * 1.5 );
		}
		
		System.out.printf("�ӱ���  %d�Դϴ�.\n", pay);	//�ȹ��κ�!!!
		
	}
}
