package book;

public class Book86_96 {
	public static void main(String[] args) {
		
		double x = 5/3.0;
		System.out.println(x);
		
		int y = 5%3;
		System.out.println(y);
			
		int a=3,b=5;

		a = b++;
		System.out.println("a : " +a+" b : "+b);
		
		int i = 5;
		i += 5;
				System.out.println(i);
		i -=5;
		System.out.println(i);
		
		i /= 2;
		System.out.println(i);
		
		int t=3, f=4;
		System.out.println(t > f);
		System.out.println(t == f);
		System.out.println(t != f);
		
		System.out.println( (t==3) && (t==5) );
		System.out.println( (t==3) || (t==5) );
		System.out.println( (t==3) != (t==5) );
		System.out.println( (t==3) ^ (t==5) );	//xor연산자. 두 논리값이 다르면 참, 같으면 거짓
		
		int asd = 1, sdf = 1;
		int aa = ++asd * 2;
		int bb = sdf++ * 2;
		
		System.out.println(aa);
		System.out.println(asd);
		System.out.println(bb);
		System.out.println(sdf);
		
		double qq = 5/4.0;
				System.out.println(qq);
				
		double dd = (double) 5/4.0;
		System.out.println(dd);
	}
}
