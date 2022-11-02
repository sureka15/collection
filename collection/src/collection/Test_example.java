package collection;
//import java .*;

public class Test_example {
	

	public static void main(String[] args) {
		{
			
			{
				int count = 0;
			String str1= "This is the story about the boy in london.";
			String str[]=str1.split(" ");
			for(int i =0;i<=str.length-1;i++)
			{
			System.out.println( str[i]);
			if(str[i].equals("the"))
			{
			count++;
			}
			}
			System.out.println("yes the present in +" +count+ "times");
			}
			}

	}


	
	
}
