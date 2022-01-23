package book;
import java.util.Scanner;

public class Book115 {
	public static void main(String[] args) {
		
		int n;
		int a = 1;
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하세요 >> ");
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		while( a <= 9) {
			System.out.println(n+"*"+a+"="+n*a);
			a++;
		}
		input.close();
	}
}
