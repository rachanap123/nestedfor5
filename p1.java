//WAP to print following pattern
/* D4 C3 B2 A1
 * A1 B2 C3 D4
 * D4 C3 B2 A1
 * A1 B2 C3 D4
 */

import java.io.*;
class P1{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of rows");
		int row = Integer.parseInt(br.readLine());

		int ch = row+65-1;
		int n = row;

		char ch1 = 'A';
		int n1=1;

		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2==0){
		
					System.out.print(ch1+""+n1+" ");
					ch1++;
					n1++;
					
				}else{
					System.out.print((char)ch+""+n+" ");
					ch--;
					n--;
				}
			}
		

			if(i%2==0){
			ch1 = 'A';
			n1 = 1;
			}else{
				ch = row+65-1;
				n=row;
			}

			System.out.println();
		}
	}
}


