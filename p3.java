/* 5 4 3 2 1
 * 8 6 4 2
 * 9 6 3
 * 8 4
 * 5
 */

import java.io.*;
class P3{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no. of rows");
		int row = Integer.parseInt(br.readLine());;

		int temp = row;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print(temp*i+" ");
				temp--;
			}
			temp = row-i;
			System.out.println();
		}
	}
}
				




