package day1;

public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=146;
		int k=3;
		System.out.println(Root(n,k));
		
	}

	public static int Root(int n, int k) {
		// TODO Auto-generated method stub
		int lo=1;
		int hi=n;
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(Math.pow(mid, k)<=n) {
				ans=mid;
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return ans;
	}

}
