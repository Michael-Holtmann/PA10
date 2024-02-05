/** Programming Assignment #10 -Program utilizes built-in arrays
 */
import java.util.*;

public class PointList
{
    final static int MAX_POINTS = 50;
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int    i;
        int    choice;
        int    k;
        double  x;
        double  y;
        double  s;

        Point[] point = new Point[ MAX_POINTS ];
        int     size = 0; // current #points in list
        
        do
        {
            displayOptions();
            choice = console.nextInt();
            if( choice == 1 )
            {
                // Add a point 
                System.out.printf( "Enter point %d as two doubles separated by spaces: ", size);
                x = console.nextDouble();
                y = console.nextDouble();
            
                // Create a single point and add to array
                // add code here
            } 
            else if( choice == 2 )
            {
                // Display the points
                System.out.println( "Point list:\n" );
        
                // add code here
                    
            }
            else if( choice == 3 )
            {
                // Remove a point from the list
                System.out.print( "Remove which point (Enter index number)? " );
                k = console.nextInt();
                    
                    // add code here
                    
            }
            else if( choice == 4 )
            {

                // calculate the the line of best-fit.
                    
                // add code here
                    
              
            }
        } while( choice < 5 );    
    }
    
    /**
     * Display the programs options to the user
     */
    public static void displayOptions()
    {
        System.out.println("\n1. Add a point to the list.      2. Display the points.");
        System.out.println("3. Remove a point from the list  4. Compute the line of best fit.");
        System.out.println("5. Quit");
        System.out.print("Which (1-5)? ");
    } 
}
