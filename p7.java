/* Row = 5
 * O
 * 14  13
 * L   K   J
 * 9   8   7   6
 * E   D   C   B   A
 */

import java.io.*;
class P7{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter no. of rows ");
		int row = Integer.parseInt(br.readLine());

		int n = (row*(row+1))/2;
		char ch = 'O';
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0){
					System.out.print(n+"\t");
					n--;
					ch--;
				}else{
					System.out.print(ch+"\t");
					n--;
					ch--;
				}
			}
			System.out.println();
		}
	}
}


