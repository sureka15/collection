package collection;

public class Orderofexecution {

	public Orderofexecution() {
		System.out.println("constructor");
	}
	
	{
		System.out.println("instance");
	}
	static {
		System.out.println("static block");
	}

	public static void main(String[] args) {
		Orderofexecution s1 =new Orderofexecution();
		System.out.println("mainmethod");
	}

}
