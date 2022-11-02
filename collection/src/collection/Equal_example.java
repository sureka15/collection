package collection;

public class Equal_example {

	
	public static void main(String args[])
	{
	String str2=" cAllFortheDay";
	String str3="CALLFortheDay      ";
	 
	String str = str2.trim();
	String str1= str3.trim();

	if(str.equalsIgnoreCase(str1))
	{
	System.out.println("is equalignorecase");
	}
	else
	{
	System.out.println("not equal");
	}
	}
	}


