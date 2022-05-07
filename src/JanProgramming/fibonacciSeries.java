package JanProgramming;

public class fibonacciSeries {

	public static void main(String[] args) {
	 int m=0;
	 
	 int num=5;
	  int n=1;
	 for( int i=1; i<=num;i++) {
		 System.out.println(m);
		 int nextnum=m+n;
		 m=n;
		 n=nextnum;
		 
	 }
	 
	 
	}

}
