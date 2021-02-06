package exceptionhandling;

public class Finally {
	static String s="roshni";
	public static void  main (String []args){
	try{
		System.out.println(s.charAt(4));
	}
	catch (StringIndexOutOfBoundsException e){
		System.out.println("ends");
		System.exit(0);
		
		}
	finally{
		System.out.println("achha thik h");
	}
	}

}
