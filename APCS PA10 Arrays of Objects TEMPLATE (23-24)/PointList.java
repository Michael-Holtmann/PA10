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
            	
            	double m  = covXY(point) / varX(point);
            	double b = meanY(point) - m * meanX(point);
            	double r = covXY(point) / (Math.sqrt(varX(point)) * Math.sqrt(varY(point)));
            	
                System.out.println("Line of best-fit:");
                System.out.printf("Y = %.3f * X + %3f\n", m, b);
                System.out.printf("r = %.3f", r);
                		
                    
              
            }
        } while( choice < 5 );    
    }
     
    private static double meanX(Point[] input) {
    	double result = 0;	
    	
    	for (int i = 0; i < input.length; i++) {
    		if(input[i] == null) break;
    		result += input[i].getX(); 
    	}
    	
    	return result/size(input);
    }
    
    private static double meanY(Point[] input) {
    	double result = 0;
    	
    	for (int i = 0; i < input.length; i++) {
    		if(input[i] == null) break;
    		result += input[i].getY(); 
    	}
    	
    	return result/size(input);
    }
    
    private static double varX(Point[] input) {
    	double result = 0;
    	
    	for (int i = 0; i < input.length; i++) {
    		if(input[i] == null) break;
    		result = Math.pow((meanX(input) - input[i].getX()), 2);
    	}
    	
    	return result/(size(input) - 1);
    }
    
    private static double varY(Point[] input) {
    	double result = 0;
    	
    	for (int i = 0; i < input.length; i++) {
    		if(input[i] == null) break;
    		result = Math.pow((meanY(input) - input[i].getY()), 2);
    	}
    	
    	return result/(size(input) - 1);
    }

    private static double covXY(Point[] input) {
    	double result = 0;
    	
    	for (int i = 0; i < input.length; i++) {
    		if(input[i] == null) break;
    		result = (input[i].getX() - meanX(input)) * (input[i].getY() - meanY(input));
    	}
    	
    	return result/size(input);
    }
    
    private static int size(Point[] input) {
    	int result = 0;
    	
    	while(true) {
    		if (input[result] == null) break;
    		
    		result++;
    	}
    	
    	return result;
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