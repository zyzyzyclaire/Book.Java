package book;

import java.util.Scanner;

public class Book75_85 {

	 public static void main(String[] args) {
		
		 boolean a;
		 
		a = true;
				 System.out.println(a);		
		a = -1>0;
			System.out.println(a);

		boolean b = ('c'>'d');	//''���̿� ������ �־� �����ڵ�ȭ
		 System.out.println(b);
		 		
		 Scanner input = new Scanner(System.in);
		 
		 int x,y;
		 
		 System.out.println("�� ���ڸ� �Է��ϼ��� >> ");
		 x = input.nextInt();
		 y = input.nextInt();
		 
		 boolean z = x>y;
		 
		 System.out.println(x+"���� "+y+"�� ū ���� "+z+"!");
		 input.close();
		 
//		���� ���� = r*r*pi
		 
		 final double PI = Math.PI;
		 int r = 3;
				 System.out.println("���� ������ >>" + PI*r*r);
				 
			
		 
	}							
}
