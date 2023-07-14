/* WAP to take a number as input and print the addition of Factorials of each digit from that number.
 * i/p:- 1234
 * o/p:- Addition of factorial of each digit from 1234 = 33.
 */

import java.io.*;
class P9{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int num = Integer.parseInt(br.readLine());
		int number = num;
		
		int x=0;
		while(num!=0){
			int rem = num%10;
			
			int fact=1;
	
			while(rem!=0){
				fact=fact*rem;
				rem--;
			}
		
			x=x+fact;
			num=num/10;

		}
		System.out.println("Addition of factorial of each digit from "+number+"="+x);
	}
}
