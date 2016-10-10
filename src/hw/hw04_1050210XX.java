package hw;

import java.util.Scanner;

public class hw04_1050210XX {

	public static void main(String[] args) {
	Scanner sca = new Scanner(System.in);
	int n=sca.nextInt();
	int ans=1;
	while(n>=1)
	{
		ans*=n;
		n--;
	}
	System.out.println(ans);
	}

}
