package day7;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		fib(n);//to print nth term
		//0 1 1 2 ...
	}

	public static void fib(int n) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c;
		int i=1;
		while(i<=n) {
			c=a+b;
			a=b;
			b=c;
			i++;
		}
		System.out.println(a);
	}

}
