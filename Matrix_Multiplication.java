//Divyam Solanki
//Oct 8 2020

package com.devmanuals;
import java.util.*;
public class Matrix_Multiplication {

    static int order(int array1[], int n)
    {

        int array[][] = new int[n][n];


        int i,j,k,length,cost;

        for ( i = 1; i < n; i++)
        {
            array[i][i] = 0;
        }

        for (length = 2; length < n; length++) {
            for (i = 1; i < n - length + 1; i++) {
                j = i + length - 1;
                if (j == n)
                    continue;
                array[i][j] = Integer.MAX_VALUE;
                for (k = i; k <= j - 1; k++) {
                    // cost = cost/scalar multiplications
                    cost = array[i][k] + array[k + 1][j] + array1[i - 1] * array1[k] * array1[j];
                    if (cost < array[i][j])
                        array[i][j] = cost;
                }
            }
        }

        return array[1][n - 1];
    }
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter array length");
        int n = scan.nextInt();
        int array[] = new int[n] ;
        for(int i=0;i<n;i++)
        {
            array[i]=scan.nextInt();
        }


        System.out.println("Minimum  multiplications  " + order(array, n));
    }
}
