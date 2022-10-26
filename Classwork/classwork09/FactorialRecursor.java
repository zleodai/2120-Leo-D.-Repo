import java.util.Scanner;;


public class FactorialRecursor {
    public int factorial(int n){
        if (n == 0)
            return 1;
        else
            return (n * factorial(n -1));
    }

    public static void main(String[] args){
        FactorialRecursor fr = new FactorialRecursor();
        Scanner s = new Scanner(System.in);
        System.out.printf("\n\n     Please enter an integer number: ");
        int count = s.nextInt();
        System.out.println("\n\nThe value of " + count + "! is: " + fr.factorial(count));
        System.exit(0);
    }
}