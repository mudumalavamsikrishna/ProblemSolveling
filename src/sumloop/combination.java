package sumloop;
import java.util.Scanner;

/**
 * created by Maxim Orlov on 23 Nov 2014
 */

/*public class combination {
	public static double function(double a, double b, double c, double d, double x) {
		return a * x + b * Math.sqrt(Math.pow(x, 3)) - c * Math.exp(-x / 50) - d;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();

		for (int i = 0; i < cases; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			double d = sc.nextDouble();
			double lower = 0;
			double upper = 100;
			double x = (upper + lower) / 2;

			while (upper - lower > 1e-7) {
				double result = function(a, b, c, d, x);
				
				if (result > 0) {
					upper = x;
				} else {
					lower = x;
				}
				
				x = (lower + upper) / 2;
			}
			
			System.out.printf("%.7f ", x);
		}

		sc.close();
	}
}*/
class combination
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]={65,238,236,225,46};
		for(int i=0;i<a.length;i++)
		{
			int n=0;
		String str=Integer.toBinaryString(a[i]);
		//System.out.println(str);
		for(int j=0;j<str.length();j++)
		{
		if(str.charAt(j)=='1')
		{
			n++;
		}
		}
		//System.out.println(n);
		if(n%2!=0)
		{
			StringBuffer sb=new StringBuffer(str);
			sb.insert(0, 1);
			System.out.println(sb);
			//int j=Integer.parseUnsignedInt(sb,2);
		}
				else
		{
		 int k=Integer.parseInt(str, 2);
		 if(k>=65&&k<=90||k>=97&&k<=122)
		 {
			 System.out.print((char)k);
		 }
		}
		}
		
	}
}