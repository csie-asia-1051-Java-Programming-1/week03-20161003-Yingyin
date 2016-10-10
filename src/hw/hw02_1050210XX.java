package hw;

import java.util.Scanner;

public class hw02_1050210XX {

	public static void main(String[] args) {
	Scanner sca =new Scanner(System.in);
	int n=sca.nextInt();
	int temp,posi=0,nega=0;
	for(int i=0;i<n;i++)
	{
		temp=sca.nextInt();
		if(temp>0)
		{
			posi++;
		}
		else
		{
			nega++;
		}
	}
	System.out.println("正數個數:" + posi);
	System.out.println("負數個數：" + nega);
	}

}
