package day4;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {-2,1,-3,4,-1,2,1,-5,4};
		Sub_Array(a);
	}

	public static void Sub_Array(int[] a) {
		// TODO Auto-generated method stub
		
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int k=i;k<a.length;k++) {
				sum=sum+a[k];
				ans=Math.max(ans, sum);
				
			}
		}
		System.out.println(ans);
	}

}
