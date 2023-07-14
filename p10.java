/* WAP to print a series of prime numbers from entered range(Take start and end number from user)
 *
 * i/p:- Enter starting number: 10
 * 	 Enter ending number: 100
 * o/p:- 11 13 17 19 ..... 89 97
 */

import java.io.*;
class P10{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter starting number: ");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter ending number: ");
		int end = Integer.parseInt(br.readLine());

		for(int i=start;i<=end;i++){
			int count = 0;

			for(int j=1;j*j<i;j++){
				if(i%j==0)
					count=count+2;

				if(count>2)
					break;
			}
			if(count<=2 && i!=1)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}

