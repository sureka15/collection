package collection;

public class Arraynewlist implements newlist {
	
	
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("I am from interface");
		
	}
	public static void main(String args[])
	{
		newlist s = new Arraynewlist();
		//s.add();
		primenumber();
	}

	private static void primenumber()
	{

		for (int i=1;i<=10;i++)
		{
			int count=0;
			for(int n =2;i<n/2;n++)
			{
				if(i%n==0)
				{
					count=1;
				}
			}
			
			if(count==0)
			{
				System.out.println(i);
				
			}
		}
		
		
		
	}
	
	
	

}
