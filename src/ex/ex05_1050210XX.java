package ex;

import java.util.Scanner;

/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105791120 楊鈺瑩
 */

public class ex05_1050210XX {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	long a=scn.nextLong();
	if(a%2==0)
	{
		System.out.println("偶數");
		
	}
	else
	{
		System.out.println("奇數");
	}
	}

}
