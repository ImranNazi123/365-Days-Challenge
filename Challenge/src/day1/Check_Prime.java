package day1;

import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		Is_Prime(n);
	}

	public static void Is_Prime(int n) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count++;
				break;
			}
			
		}
		if(count>0) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
	}

}
