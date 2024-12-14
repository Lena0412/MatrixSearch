/*
Program Name: MatrixSearch.java
Programmer's Name: Elena Jones
Program Description: This program creates an array, searches the array for the first all-zero row, and then either prints the row number or that no all-zero row has been found.
 */
package matrixsearch;

public class MatrixSearch {
    public static void main(String[] args) {
        int x[][] = {{2,4,7},
                     {8,2,9},
                     {0,0,0}}; // Initialize matrix
        int i, j;
        boolean found = false; // Flag
        for (i = 0; i < 3; i++) {
            found = true;
                for(j = 0; j < 3; j++) {
                    if(x[i][j] != 0) {
                        found = false; // Indicate not found
                        break;
                    }
                }
        if (found) {
            System.out.println("First all-zero row is: " + (i + 1));
            break;
        }        
        }
        if (!found) {
            System.out.println("No all-zero row found.");
        }
    }
}
