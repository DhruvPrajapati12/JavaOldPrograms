package patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		
		for(int i =1;i<=n ; i++) {
			for(int j = 1;j<=n-i ; j++) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i ; k++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
