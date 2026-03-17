package day12;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		//test cases input as t
		int t=kb.nextInt();
		//no. of inputs/test cases to be performed loop
		while(t>0) {
			int n=kb.nextInt();//no. of moves
			int m=kb.nextInt();//no. of cubes
			ans(n,m);
			t--;
		}
	}

	public static void ans(int n, int m) {
		// TODO Auto-generated method stub
		if(n<m) {
			System.out.println("No");
		}
		else if(n>m) {
			int remaingMoves=n-m;
			if(remaingMoves%2==0) {
				System.out.println("YES");
			}
			else {
				System.out.println("No");
			}
		}
		//if moves and cubes are equal
		else {
			System.out.println("YES");
		}
	}

}
