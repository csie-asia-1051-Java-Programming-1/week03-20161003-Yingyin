package hw;

import java.util.Scanner;

public class hw01_1050210XX {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		int x=sca.nextInt();
		int ans=0;
		while(x>0)
		{
			x/=10;
			ans++;
		}
		System.out.println(ans);
	}

}
