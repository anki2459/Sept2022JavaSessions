package JavaSessions;


public class ArrayConcepts 
{

	public static void main(String[] args) 
	{
		//int array
		int i[]= new int[4];
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40;
		 
		 System.out.println(i[0]);
		 System.out.println(i[3]);
		 // System.out.println(i[4]);   //Index 4 out of bounds for length 4
		 //System.out.println(i[-1]);  //Index 4 out of bounds for length 4
		// System.out.println(i);    //[I@58d25a40
		 System.out.println("The addition of 2 and 3 rd is: "+(i[3]+i[2]));
		 int leng= i.length;
		 System.out.println("Length is : "+leng);
		 System.out.println("Hi is : "+(leng-1));
		 System.out.println("Li is : "+0);

		 //print all
		 
		 //for loop
		 for(int x=0;x<leng;x++)
		 {
			 System.out.println("The value of i in "+x+" is:"+i[x]);
		 }
		 
		 //enhanced for loop
		 for(int e:i)
		 {
			 System.out.println("The value of x in :"+e);
		 }
		 //Double array:
		 double d[] = new double[3];
		 d[0] = 10.233;
		 d[1] = 20.233;
		 d[2] = 30.333;
		 
		 for(double e:d)
		 {
			 System.out.println(e);
		 }
		 
		 //char array
		 char c[] = new char[3];
		 c[0] = 'a';
		 c[1] = '$';
		 c[2] = '1';
		 
		 for(char e:c)
		 {
			 System.out.println(e);
		 }
		 
		 //Object Array
		 
		 Object emp[] = new Object[3];
		 emp[0] = "Ankita";
		 emp[1] = 32;
		 emp[2] = 2500000.33f;
		 
		 for(Object e: emp) {
			 System.out.println(e);
		 }
	}

}
