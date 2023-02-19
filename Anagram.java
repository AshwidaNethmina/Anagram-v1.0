import java.util.Scanner;

public class Anagram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first word: ");
		String a = sc.nextLine();
		System.out.print("Enter the second word: ");
		String b = sc.nextLine();
		
		char[] a_arr = a.toCharArray();
		char[] b_arr = b.toCharArray();
		
		if(a.length() != b.length())
		{
			System.out.println();
			System.out.println(a +" and "+b+" are not anagrams");
			System.exit(0);
		}
		
		int len = a.length();
		int eSum = 0;
		
		for(int i=0; i<len; i++)
		{
			//System.out.println("i= "+i);
			for(int j=0; j<len; j++)
			{
				//System.out.println("\tj= "+j);
				if(a_arr[i] == b_arr[j] || Character.toUpperCase(a_arr[i]) == Character.toUpperCase(b_arr[j]))
				{
					a_arr[i] = '*';
					b_arr[j] = '*';
					eSum++;
					//System.out.println(eSum);
					break;
				}
				
			}
		}
		
		if(eSum == len)
		{
			System.out.println();
			System.out.println("'"+a +"' and '"+b+"' are anagrams");
		}
		else
		{
			System.out.println();
			System.out.println("'"+a +"' and '"+b+"' are not anagrams");
		}
		//System.out.print(a_arr[0]);
	}
}