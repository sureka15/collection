package collection;

public class Repetative_word {
	
	public static void repeat()
	{
		String s="abcdabcdxxa";
		char[] word = s.toCharArray();
		System.out.println(word.length);
		
		for (int i = 0; i < word.length; i++) {
			{
				for (int j = i+1; j<word.length; j++) {
					if(word[i]==word[j])
					{
					System.out.println(word[j]);
					break;
					}
					
				}
			}
			
		
		}
		
	}
	
	
	public static void reversenumber()
	
	{
	int a = 123456;
	int rev=0;
	int r=0;
	while(a!=0)
	{
		int remainder = a%10; //--->6,5,4,3,2,1
		rev=rev*10+remainder; // --->6,65,654,6543,65432,654321
		 a= a/10;    //------> // 12345,1234,123,12,1
	}
		System.out.println(rev);
	
	
	for (int b =123456;b!=0;b=b/10)
	{
		int remainder = b%10;
		r =r*10+remainder;
	}
	System.out.println(rev);
	}
	private static  void revnum()
	{

		int t=198765;
		int rev=0;
		while(t>0) 
		{
			
			rev=rev*10 + t%10;    // 5*10 +  6
			t=t/10;               
		}
		System.out.println(rev);
		
	}
	public static void main(String[] args) {
//repeat();
reversenumber();
revnum();
	}

}
