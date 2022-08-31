import java.util.Scanner;  

class HelloSayer {
	public static void main(String args[]){
	
	Scanner myInput = new Scanner( System.in );

	System.out.println("What is thy name?");
  	String input = myInput.nextLine();

	System.out.println("\n\n\n Hello " + input + "\n\n\n");

	}
}