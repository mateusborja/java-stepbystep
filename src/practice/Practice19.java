//sum 888
package practice;

public class Practice19 {
	
	public void niceSum() {
		
		int i,j;
		
		for (i = 100; i < 1000; i++) {
			for (j=100; j < 1000; j++) {
				int n = i + j;
				if (n==888) {
					System.out.println(i + " + " + j + " = " + n);
				}
			
				
			}
		}
		
	}

}
