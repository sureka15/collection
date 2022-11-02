package collection;

public class prime_number {

	public static void main(String[] args) {
		
		for(int i=1;i<=120;i++)
		{int	count =0;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					count=1;
				}

				}
			if(count ==0)
			{
				System.out.println("prime"+i);
			}
			//System.out.println("not prime"+i);

			}
		
			
		
		
		
		
		
		
		
		
}}