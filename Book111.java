package book;
import java.util.Scanner;

public class Book111 {
	public static void main(String[] args) {
		
		String a = "january";
		int monthnumber;
		
		switch (a) {
			case "january" : monthnumber = 1; 
			break;
			case "fabuary" : monthnumber = 2; 
			break;
			case "march" : monthnumber = 3; 
			break;
			default : monthnumber = 00;
			break;
		}
		System.out.println(monthnumber);
		
		int month;
		int days = 0;
		
		System.out.println("�ϼ��� �˰� ���� ���� �Է��ϼ��� >> ");
		Scanner input = new Scanner(System.in);
		month = input.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7 : case 8 : case 10 : case 12 :
			days = 31;
			break;
			
		case 4: case 6: case 9: case 11: 
			days = 30;
			break;
			
		case 2:
			days = 28;
			
		default : System.out.println("���� �߸� �ԷµǾ����ϴ�.");
			break;
		}
		
		System.out.println("���� ������ >> "+ days);
		
		input.close();
	}
}
