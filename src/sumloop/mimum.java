package sumloop;

import java.util.Scanner;
public class mimum
{
    public static void main(String[]args)
    {
        Scanner str=new Scanner(System.in);
        int t=str.nextInt();
        int arr[]=new int[100];
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<3;j++)
            {
            arr[j]=str.nextInt();
        }
        }
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<3;j++)
            {
            System.out.print(arr[j]+" ");
        }
            System.out.println(" ");
        }
        str.close();
    }
}