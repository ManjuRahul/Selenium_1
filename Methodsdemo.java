
public class Methodsdemo {

	public static void main(String[] args) {
		
		Methodsdemo d = new Methodsdemo(); // object created for getdata
		String name = d.getdata();
		System.out.println(name); 
		Methodsdemo2 d1 = new Methodsdemo2(); //object created to access elements in getuserdata
		String name2 = d1.getuserData(); // to access returning element of getuserdata. 
		System.out.println(name2);
		getdata2();
		
	}
	public String getdata() // made 'public' to use in any other class also 
						  // void is used because method doesnt return anything
					      // Can use string or int based on the scenario
	{
		System.out.println("Hi bro, whats up?");
		return "whats up"; 
	}

	public static String getdata2() // Static will put this method in the class 
									// no need to create an object to access this
	{
		System.out.println("This is static");
		return "bye bye!"; 
	}
}
