package collection;

public class Datatype {

	public static void main(String[] args) 
	{


/*
byte [-127 to 128 ]        //String 
short [3200.. to       //  Array
int          
long
float
double
char
boolean
*/
		
//lower to higher easily //

int a=100;

// int to long

long b=a;   //WIDENING         //takesScreenshot(Parent)-CHROMEDRIVER(child)

System.out.println(b);//1

//String to int

String x="12345";

int h=Integer.parseInt(x);

System.out.println(h+10);//2

//int to String 

int y=198;
String s =String.valueOf(y);

System.out.println(s);//3

//byte to short 

byte b1 = 10;
 
short s1 = b1;
System.out.println(s1);//4

//short to byte 

byte q = (byte) s1;
System.out.println(q);//5

// double t o float 

double d = 234.235;

float f = (float) d;
System.out.println(f);//6

// double to string
String g = String.valueOf(d);
System.out.println(g);


// String to double

String str = "1234579";

double db = Double.parseDouble(str);

System.out.println(db);


// double to string;


String str2 = String.valueOf(db);
System.out.println(str2); 















//HIGHER TO LOWER

int c=(int) b;  //narrowing     //takesScreenshot(parent)-Webdriver(parent)


System.out.println(c);//7










		
	}

}
