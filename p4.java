/* WAP to print all even no.s in reverse order and odd no.s in std way within range.Take
 * start and end from user.
 * input - start no - 2  
 * 	   end no - 9
 * output - 8 6 4 2 
 * 	    3 5 7 9
 */

import java.io.*;
class P4{
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter start no. ");
		int start = Integer.parseInt(br.readLine());

		System.out.println("Enter end no. ");
		int end = Integer.parseInt(br.readLine());

		for(int i=end;i>=start;i--){
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();
		for(int i=start;i<=end;i++){
			if(i%2!=0)
				System.out.print(i+" ");
		}
		System.out.println();
		}
}

