package day9;

public class Try {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {1,2,3,4};
		int [] x=Pro(a);
		//print array
		for(int i=0;i<a.length;i++) {
			System.out.print(x[i]+" ");
		}

	}

	public static int [] Pro(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		int [] left=new int [n];
		int [] right=new int[n];
		left[0]=1;
		right[n-1]=1;
		
		//left prod
		for(int i=1;i<n;i++) {
			left[i]=left[i-1]*a[i-1];
			
		}
		//right prod
		for(int i=n-2;i>=0;i--) {
			right[i]=right[i+1]*a[i+1];
			
		}
		
		//full prod
		for(int i=0;i<n;i++) {
			left[i]=left[i]*right[i];
			//System.out.print(left[i]+" ");
		}
		
		return left;
		
		}

}
