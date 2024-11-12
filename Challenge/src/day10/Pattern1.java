package day10;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		Pattern(n);
	}

	public static void Pattern(int n) {
		// TODO Auto-generated method stub
		int star=n;
		int row=1;
		while(row<=n) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			//next row
			row++;
			System.out.println();
			
		}
	}

}
