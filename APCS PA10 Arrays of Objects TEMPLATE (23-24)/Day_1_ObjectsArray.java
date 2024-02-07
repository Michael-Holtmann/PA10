
/*
 * Day 1: Arrays of Objects - Strings
 */
public class Day_1_ObjectsArray
{
    public static void main(String[ ]args )
    {
        /* Create an array of 5 int's */
    	int[] x = new int[5];
        
        /* Create an array of 5 Strings */
        
    	String[] a = new String[5];
    	
        /* Print the array out using the print method below.
         * Discuss the null reference. */
    	
    	print(x);
        
        /* Create three Strings, "Alejandro", "Sarah", and "Lucy" using String class constructor and add to array */
         
    	String one = new String("Alejandro");
    	String two = new String("Sarah");
    	String three = new String("Lucy");
    			
    	a[0] = one;
    	a[1] = two;
    	a[3] = three;
    	
        /* Compare and contrast the structural features of these two arrays */
        
        /* Discuss the null reference and some if its uses. */
        
        /* Call a method which returns the longest String in array, names. */
    	
    	System.out.println(longest(a));
    	System.out.println(numStr(a));
        
        /* Uses for null. */
        
    }
    
    /* Write a method that takes and Array of Strings and returns the longest String in
     * the array */
    
    public static String longest(String[] input) {
    	String result = input[0];
    	
    	for (int i = 1; i < input.length; i++) {
    		if (input[i] != null && input[i].length() > result.length() ) result = input[i]; 
    	}
    	
    	return result;
    }
     
    /* Write a method that determines the number of String stored in the array by
     * counting nulls. */
    
    public static int numStr(String[] input) {
    	int result = input.length;
    	
    	for (int i = 0; i < input.length; i++) {
    		if (input[i] == null) result--;
    	}
    	
    	return result;
    }
    
    /* A method that prints and array of int */
    
    public static void print( int[ ] x)
    {
        for( int i=0; i < x.length-1; i++ )
        {
            System.out.printf("%d, ", x[i] );
        }
        System.out.printf("%d\n", x[x.length-1] );
    }
}
