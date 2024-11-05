package day3;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {4,5,3,2,1};
		Sort(a);
		//print
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

	public static void Sort(int[] a) {
		// TODO Auto-generated method stub
		
		for(int turn=1;turn<a.length;turn++){
			for(int i=0;i<a.length-turn;i++) {
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				
			}
		}
		
	}

}
