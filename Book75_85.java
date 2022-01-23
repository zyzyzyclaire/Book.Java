package book;

import java.util.Scanner;

public class Book75_85 {

	 public static void main(String[] args) {
		
		 boolean a;
		 
		a = true;
				 System.out.println(a);		
		a = -1>0;
			System.out.println(a);

		boolean b = ('c'>'d');	//''사이에 문자형 넣어 유니코드화
		 System.out.println(b);
		 		
		 Scanner input = new Scanner(System.in);
		 
		 int x,y;
		 
		 System.out.println("두 숫자를 입력하세요 >> ");
		 x = input.nextInt();
		 y = input.nextInt();
		 
		 boolean z = x>y;
		 
		 System.out.println(x+"보다 "+y+"가 큰 것은 "+z+"!");
		 input.close();
		 
//		원의 면적 = r*r*pi
		 
		 final double PI = Math.PI;
		 int r = 3;
				 System.out.println("원의 면적은 >>" + PI*r*r);
				 
			
		 
	}							
}
