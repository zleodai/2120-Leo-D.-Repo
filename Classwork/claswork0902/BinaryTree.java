import source.*;
import java.util.ArrayList;

class BinaryTree {

    public static void preOrderPrinter( BinaryTreeNode node ) {
      if( node == null ) {
         return;
      }
      System.out.print( "[" + node.getString() + "]" );
      preOrderPrinter( node.getChild( "L" ) );
      preOrderPrinter( node.getChild( "R" ) );
   }

   public static void postOrderPrinter( BinaryTreeNode node ) {
      if( node == null ) {
         return;
      }
      preOrderPrinter( node.getChild( "L" ) );
      preOrderPrinter( node.getChild( "R" ) );
      System.out.print( "[" + node.getString() + "]" );
   }

   public static void inOrderPrinter( BinaryTreeNode node ) {
      if( node == null ) {
         return;
      }
      preOrderPrinter( node.getChild( "L" ) );
      System.out.print( "[" + node.getString() + "]" );
      preOrderPrinter( node.getChild( "R" ) );
   }

    public static ArrayList<Object> preOrderReturner( BinaryTreeNode node ) {
        ArrayList<Object> output = new ArrayList<Object>();

        var Obs = node;

        

        
    }

    public static void main( String[] args ) {
        BinaryTreeNode root = new BinaryTreeNode( "root" );
        root.add( "1", "L" );
        root.add( "HI", "R" );
        BinaryTreeNode one = root.getChild( "L" );
        BinaryTreeNode two = root.getChild( "R" );
        one.add( "NUMBER 3", "L" );
        one.add( "suck", "R" );
        two.add( "my", "L" );
        two.add( "hi", "R" );
        BinaryTreeNode six = two.getChild( "R" );
        six.add( "aosdk", "L" );
        six.add( "8", "R" );


        System.out.println("\n\npreOrderPrinter: ");
        preOrderPrinter(root);
        System.out.println("\n\npostOrderPrinter: ");
        postOrderPrinter(root);
        System.out.println("\n\ninOrderPrinter: ");
        inOrderPrinter(root);

    }

    
}
        