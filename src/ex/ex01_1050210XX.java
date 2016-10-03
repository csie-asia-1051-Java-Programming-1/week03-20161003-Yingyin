package ex;

import java.util.Scanner;

/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105791120 楊鈺瑩
 */

public class ex01_1050210XX {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		char[] data = str.toCharArray();
		for(int i=data.length-1;i>=0;i--)
		{
			System.out.println(data[i]);
		}
	}

}
