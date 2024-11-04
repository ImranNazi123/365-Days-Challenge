package day2;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5,6,7};
		int n=a.length;
		int k=3;//no. of digit to rotate...
		k=k%n;
		Rotate(a,0,n-k-1);//0-3
		Rotate(a,n-k,n-1);//4-6
		Rotate(a,0,n-1);//full reverse
		//print 
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void Rotate(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
	}

	
	}

	 

}
