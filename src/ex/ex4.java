package ex;
/*
 * Date: 2016/11/14
 * ���ϥΪ̿�J�@�ӥ���� n�A���ۨϥλ��j�I�s�L�X n! �����G�C
 * Author: 105021060 ���T��
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
