import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

   public static void main(String []args) throws IOException {
      // Create File, Scanner, and String() OBJECTS
      // use the format: ClassName objectName = new ClassName();
      File myFile = new File("pokemon (1).csv");
      Scanner scan = new Scanner(myFile);
      String[] pokemonLines = new String[152];

      // initialize a line counter
      int i = 0;
      // Loop through every line in the File using Scanner methods
      // loop while Scanner can still find another line in the Fine AND our line cointer is less than 10
      while ( scan.hasNext() && (i < 152) ) {
         // Read in the next line from the File
         String currentLine  = scan.nextLine();
         // Assign the line to be stored in the Array
         pokemonLines[i] = currentLine;
         // Print out that line from the Array
         System.out.println(pokemonLines[i]);
         // Increment line counter
         i++;
      }


   }
}
