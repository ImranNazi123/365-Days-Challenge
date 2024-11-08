package day6;

import java.util.Scanner;

public class Armstron_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner kb=new Scanner(System.in);
			int n=kb.nextInt();
			int x=n;
			int y=Count(n);
//			System.out.println("n = "+x);
//			System.out.println("count= "+y);
			System.out.println(Armstrong(y,x));
			
			
			
		}

		public static boolean Armstrong(int y, int x) {
			// TODO Auto-generated method stub
			int Arm=x;
			int sum=0;
			//check armstrong or not
			while(x>0) {
				int rem=x%10;
				sum=(int) (sum + Math.pow(rem, y));
				x/=10;
			}
//			System.out.println("sum= "+sum);
			if(sum==Arm) {
				return true;
			}
			else {
				return false;
			}
			
		}

		public static int Count(int n) {
			// TODO Auto-generated method stub
			int count=0;
			while(n>0){
				
				n/=10;
				count++;
				
		}
			return count;

	

	}

}
