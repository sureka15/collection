package collection;

public class Common_word {

	public static void main(String[] args) {

		String s1 = "good@name234goodAZ";
		//String s = "good manner";
		
		String replace = s1.replaceAll("[^a-z]","");
		System.out.println(replace);
		//String[] a1 = s.split(" ");
		/*int count=0;
		for (String a2 : a) {
			for (String a3 : a1) {
				if(a2.equals(a3))
				{
					count++;
					System.out.println("common word "+ a2);
				}
				
				}
				
		}
		System.out.println(count);*/
		
		/*for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				if(a[i].equals(a[j]))
				{
					System.out.println("common char  " + a1[j]);
				}
				
			}
			
		}*/
		
		
		
		
	}
	
}
