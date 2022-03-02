
public class Program1 {

	public static void main(String[] args) {
		
		
		String str = "Name is Rahul".toLowerCase();
		String[] splittedstr = str.split("");
		
		//System.out.println(splittedstr[0]); 
		//System.out.println(splittedstr[1].trim());
		//System.out.println(splittedstr[2]);
		
		for (int i=str.length()-1;i>=0;i--)
		{
			System.out.println(str.charAt(i));
			

		}

}
}