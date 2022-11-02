package collection;

public class String_demo {

	public static void main(String[] args) {

		/*	String s = "56777aaaa";
		char[] ch = s.toCharArray();
		String s1="";
		for (int i = 0; i < ch.length; i++) {
			if(!Character.isDigit(ch[i]))
			{
				s1=s1+ch[i];
					}
					}
		System.out.println(s1);*/
		
		String s= "sssssuuuuurrrrrreeeeekkkkkkaaaaa";
		char ch[]= s.toCharArray();
		int count=1;
			
	for (int i = 0; i <= ch.length-1; i++) {
		for(int j=i+1;j<=ch.length-1;j++)
		{
			if(ch[i]==ch[j]&&ch[i]!=' ')
			{
				count++;
				//ch[j]=0 is avoid duplicate character
				ch[j]='0';
			}
		}
		if(count>1&&ch[i]!='0')
		{
			System.out.print(ch[i]);
		}
	}
		
	}

	

}
