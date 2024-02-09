/** Programming Assignment #10 -Program utilizes built-in arrays
 */

import java.util.*;

public class PointList
{
    final static int MAX_POINTS = 50;
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        
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
            	int control = 0; 
                // Add a point 
                System.out.printf( "Enter point %d as two doubles separated by spaces: ", size);
                x = console.nextDouble();
                y = console.nextDouble();
                
                for (int i = 0; i < point.length; i++) {
                	control = i;
             
                	if (point[i] == null) break;
                }
                
                point[control] = new Point();
                
                point[control].setX(x);
                point[control].setY(y);
            } 
            else if( choice == 2 )
            {
                // Display the points
                System.out.println( "Point list:\n" );
        
                for (int i = 0; i < point.length; i++) {
                	if (point[i] == null) break;
                	
                	double distance = Math.sqrt(Math.pow(point[i].getX(), 2) + Math.pow(point[i].getY(), 2));
                	
                	
                	System.out.printf("(%.2f, %.2f) The distance from origin = %.2f", point[i].getX(), point[i].getY(), distance);
                	System.out.println();
                }
                    
            }
            else if( choice == 3 )
            {
            	
                // Remove a point from the list
                System.out.print( "Remove which point (Enter index number)? " );
                k = console.nextInt();
                
                if (k <= point.length -1 || point[k] != null) {
                	Point[] temp = new Point[point.length - (k-1)];
                    
                    for (int i = k+1, j = 0; i < point.length; i++, j++) {
                    	if (point[i] == null) break;
                    	
                    	temp[j] = point[i];
                    }
                    
                    for (int p = k, t = 0; t < temp.length || p < point.length; p++, t++) {
                    	if (temp[t] == null) {
                    		point[p] = null;
                    		break;
                    	}
                    	point[p] = temp[t];
                    	

                    }
                    if (temp[temp.length - 1] != null) point[point.length - 1] = null;               
          
                    
                    
                    temp = null;
                    System.gc();
                }
                    
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