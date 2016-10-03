package ex;

import java.util.Scanner;

/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105791120 楊鈺瑩
 */

public class ex03_1050210XX {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		char ch1=scn.next().charAt(0);
		if(ch1>='a' && ch1<='z')
		{
			System.out.println((char)(ch1-'a'+'A'));
		}
		else
		{
			System.out.println((char)(ch1-'A'+'a'));
		}
	}

}
