package hw;

import java.util.Scanner;

public class hw03_1050210XX {

	public static void main(String[] args) {
	Scanner sca= new Scanner(System.in);
	int n=sca.nextInt();
	int ans=1;
	for(int i=1;i<=n;i++)
	{
		ans*=i;
	}
	System.out.println(ans);
	}

}
