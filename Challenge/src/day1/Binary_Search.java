package day1;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,3,4,5,7,9,11,13,16,18,20,22,24,26};
		System.out.println(Search(a,9));
	}

	public static int Search(int[] a, int i) {
		// TODO Auto-generated method stub
		int lo=0,hi=a.length-1;
		int item=i;
		int mid=(lo+hi)/2;
		while(lo<=hi) {
			if(a[mid]==item) {
				return mid;
			}
			else if(a[mid]>item) {
				hi=mid-1;
				
			}
			else {
				lo=mid+1;
			}
			
		}
		return -1;
	}

}
