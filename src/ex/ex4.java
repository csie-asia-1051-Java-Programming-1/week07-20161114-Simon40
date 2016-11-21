package ex;
/*
 * Date: 2016/11/14
 * 讓使用者輸入一個正整數 n，接著使用遞迴呼叫印出 n! 的結果。
 * Author: 105021060 陳俊仁
 */
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println(fun(n));
	}
	private static int fun(int x){
		if(x==1){
			return 1;
		}else{
			return x+fun(x-1);
		}	
	}

}
