package exceptionhandling;

public class Name {
	public static void main(String[] args) {
		String name = "roshni";
		try {
			System.out.println("Lenght of name is " +"name length");
            System.out.println("Character at 7 possition is "+name.charAt(7));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("String abhi choti hI!!!!");
			
            
		} catch(RuntimeException e){
			System.out.println("Error" +e.getMessage());
		}
	}

}
