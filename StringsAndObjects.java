package Main;

public class First {
	
	public static void main(String[] args)
	{
	
		String helloVar = "Hello";
		String worldVar = "world.";
		
		Object concatVariablesObj = helloVar+" "+worldVar;
		String concatString = (String) concatVariablesObj;
		System.out.println(concatString);
	}
}
	 
