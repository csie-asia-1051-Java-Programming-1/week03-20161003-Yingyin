package hw;

import java.util.Scanner;

public class hw05_1050210XX {

	public static void main(String[] args) {
	Scanner sca =  new Scanner(System.in);
    int n=sca.nextInt();
    int ans = 0;
    for(int i=0;i<=n;i++)
    {
    	ans+=(i*(i+1));
    }
    System.out.println(ans);
	}

}
