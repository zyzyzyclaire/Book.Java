package book;

import java.util.Scanner;

	public class Book109 {
		public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	System.out.println("���� ����� �Է��ϼ��� >> ");

		int size = input.nextInt();
				
		if (size < 100) {
			System.out.println("small");
		} else if (size < 200) {
			System.out.println("medium");
		} else {
			System.out.println("large");
		}
		
		input.close();

	}
}
