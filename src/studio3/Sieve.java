package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insert a number: ");
		int n = in.nextInt();
		
		int[] num = new int[n-1];
		num[0] = 2;
		int saved = 0;
		
		while(saved <= (n-1)-1) {
			num[saved] = saved + 2;
			saved++;
		}
		
		boolean[] iscomposite = new boolean[n-1];
		int check = 0;
		while(check < (n-1)) {
			if	(iscomposite[check] == false) {
				for (int i = 0 ; i < (n-1) ; i++) {
					if (num[i] % num[check] == 0 && num[i] != num[check]) {
						iscomposite[i] = true;
					}
				}
			}
			check++;
		}
		
		for( int b = 0 ; b < (n-1) ; b++) {
			if (!iscomposite[b]) {
			System.out.println(num[b]);
			}
		}
	}

}
