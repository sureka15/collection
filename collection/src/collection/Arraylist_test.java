package collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_test {

	public static void main(String args[])
	{

		List<String> myarrayList= new ArrayList<String>();
		int sum =0;
	myarrayList.add("1");
	myarrayList.add("2");
	myarrayList.add("3");
	myarrayList.add("four");
	myarrayList.add("7");
	for(String s : myarrayList)
	{
			System.out.println(s);
	if(s.equals("Opera"))
	{
	System.out.println("is equal");
	}
	}
	System.out.println(myarrayList.size());

}
}
