/* WAP and take 2 characters, if these characters are equal then print them as it  is 
 * but if they are unequal then print their difference (consider positional difference
 * and not ASCII).
 */

import java.io.*;
class P6{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter character 1: ");
		char ch1 = (char)br.read();

		br.skip(1);

		System.out.println("Enter character 2: ");
		char ch2 = (char)br.read();

		if(ch1==ch2){
			System.out.println(ch1+" "+ch2);
		}
		else if(ch1>ch2){
			System.out.println("The difference between "+ch1+" and "+ch2+" is "+(ch1-ch2));
		}
		else{
			System.out.println("The difference between "+ch1+" and "+ch2+" is "+(ch2-ch1));
		}

	}
}

