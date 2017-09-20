package GFG;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws Exception {
	
	    BufferedReader asd = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t = Integer.parseInt(asd.readLine().trim());
	    while(t--!=0){
	        float X = Float.parseFloat(asd.readLine().trim());
	        int i = Integer.parseInt(asd.readLine().trim());
	        int j = Integer.parseInt(asd.readLine().trim());
	        System.out.println(findWater(i,j,X));
	    }
	}
	    static float findWater(int i, int j, float X)
	    {
	       
	        // There will be i*(i+1)/2 glasses till ith row (including ith row)
	        float[] glass= new float[i * (i + 1) / 2];
	     
	     
	        // Put all water in first glass
	        int index = 0;
	        glass[index] = X;
	     
	        // Now let the water flow to the downward glassses till the
	        // amount of water X is not 0 and row number is less than or
	        // equal to i (given row)
	        for (int row = 1; row <= i && X !=0.0; ++row)
	        {
	            // Fill glasses in a given row. Number of columns in a row
	            // is equal to row number
	            for (int col = 1; col <= row; ++col, ++index)
	            {
	                // Get the water from current glass
	                X = glass[index];
	     
	                // Keep the amount less than or equal to
	                // capacity in current glass
	                glass[index] = (X >= 1.0f) ? 1.0f : X;
	     
	                // Get the remaining amount
	                X = (X >= 1.0f) ? (X - 1) : 0.0f;
	     
	                // Distribute the remaining amount to the down two glasses
	                glass[index + row] += X / 2;
	                glass[index + row + 1] += X / 2;
	            }
	        }
	     
	        // The index of jth glass in ith row will be i*(i-1)/2 + j - 1
	        return glass[i*(i-1)/2 + j - 1];
	    }
	     
	   
}