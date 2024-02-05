
/*
 * Day 1: Arrays of Objects - Strings
 */
public class Day_1_ObjectsArray
{
    public static void main(String[ ]args )
    {
        /* Create an array of 5 int's */
        
        /* Create an array of 5 Strings */
        
        /* Print the array out using the print method below.
         * Discuss the null reference. */
        
        /* Create three Strings, "Alejandro", "Sarah", and "Lucy" using String class constructor and add to array */
         
        /* Compare and contrast the structural features of these two arrays */
        
        /* Discuss the null reference and some if its uses. */
        
        /* Call a method which returns the longest String in array, names. */
        
        /* Uses for null. */
        
    }
    
    /* Write a method that takes and Array of Strings and returns the longest String in
     * the array */
     
    /* Write a method that determines the number of String stored in the array by
     * counting nulls. */
    
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
