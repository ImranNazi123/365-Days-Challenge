package day13;

import java.util.Scanner;

public class Pattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		Patt(n);
		
		
	}

	public static void Patt(int n) {
		// TODO Auto-generated method stub
		int no=1;//number
		int row=1;
		while(row<=n) {
			//print no
			int i=1;
			while(i<=no) {
				System.out.print(i+" ");
				i++;
			}
			//updation..
			row++;
			no++;
			System.out.println();
			
			
		}
		
	}

	}


