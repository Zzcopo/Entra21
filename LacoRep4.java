
public class LacoRep4 {
	public static void main(String[] args) {

		int somaPar = 0;
		int somaImp = 0;

		for (int n = 1; n <= 100; n++) {
			if (n % 2 == 0) {
				somaPar = somaPar + n;
			}
			else {
						somaImp = somaImp + n;
					}
			
				}
		System.out.println("soma par = " + somaPar);
		System.out.println("soma impar =" + somaImp);
	}
			
		
	}