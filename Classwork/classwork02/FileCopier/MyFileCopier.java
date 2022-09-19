import copiersupport.TargetFile;
import copiersupport.SourceFile;
import java.util.Scanner;

public class MyFileCopier {
    
    private static String sourceFileName;
    private static String targetFileName;

    public MyFileCopier() {
        System.out.print("\n\n Welcome to the 'MyFileCopier' program. \n");
        Scanner myInput = new Scanner(System.in);
        System.out.print("  PLEASE ENTER A FILE NAME   ");
        sourceFileName = myInput.nextLine();
        targetFileName = sourceFileName + ".copy";
        System.out.println("\n   Copying " + sourceFileName + " to " + targetFileName);
    }

    public static void main( String[] args) {

        MyFileCopier mfc = new MyFileCopier();
        SourceFile sf = new SourceFile( sourceFileName );
        String fileContents = sf.getBuffer();
        System.out.println( "contents: " + fileContents);
        TargetFile tf = new TargetFile( targetFileName, fileContents);
        System.exit( 0 );

    }


}