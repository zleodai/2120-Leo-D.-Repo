/* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  SayHelloSolution.java
 *  Simple development environment test that uses Java I/O
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
import java.util.Scanner;
class SayHelloSolution {
   public static void main( String args[] ) {
      System.out.println( "Enter a name so I can greet you: ");
      Scanner myInput = new Scanner( System.in );
      String myName = myInput.nextLine();
      System.out.println( "Hello, " + myName + "!" );
   }
}
