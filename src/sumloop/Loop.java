package sumloop;
import java.util.Scanner;
public class Loop {
	public static void main(String[]args){
		Scanner str=new Scanner(System.in);
		int arr[][] = new int[100][100],arr1[][]= new int[100][100];
		int t=str.nextInt();
		for(int i=0;i<t;i++){
			for(int j=0;j<2;j++){
				arr[i][j]=str.nextInt();
	}
		}
		for(int i=0;i<t;i++){
			int result=0;
			for(int j=0;j<2;j++){
                result=result+arr[i][j];
}
			System.out.print(result+" ");
		}
}
}