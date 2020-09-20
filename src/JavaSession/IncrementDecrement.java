package JavaSession;


public class IncrementDecrement {

	public static void main( String[] args) {
	
		//post increment
		int a = -9;
		int b = a++;
		
		System.out.println(a); //-8
		System.out.println(b); //-9
		
	
	//pre increment
		
		int k= -3;
		int j =++k;
		System.out.println(k); //-2
		System.out.println(j); //-2
		
		
		
		
		//post decrement
		
		int m =10;
		int n =m--;
		
		System.out.println(m); //9
		System.out.println(n); //10
		
		int m1 =-5;
		int n1 =m1--;
		
		System.out.println(m1); //-6
		System.out.println(n1); //-5
		
		//pre-decrement
		
		int y= 10;
		int r= --y;
		
		System.out.println(y); //9
		System.out.println(r); //9
		
		
		int y1= -101;
		int r1= --y1;
		
		System.out.println(y1); // -102
		System.out.println(r1); // -102
	
		
		int u =9;
		
		int w= --u;
		
		System.out.println(u); //8
		System.out.println(w); //8
	
	
	}
	
	
	
     

}
