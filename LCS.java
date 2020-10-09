//Divyam Solanki
// Oct 8 2020

package com.devmanuals;
import java.util.*;

public class LCS
{

    int lcs( char[] a, char[] b, int c, int d )
    {
        if (c == 0 || d == 0)
            return 0;
        if (a[c-1] == b[d-1])
            return 1 + lcs(a, b, c-1, d-1);
        else
        if(lcs(a,b,c,d-1)>=lcs(a, b, c-1, d))
        {
            return lcs(a, b, c, d-1);
        }
        else {
            return lcs(a, b, c-1, d);
        }

    }
    public static void main(String[] args)
    {
        LCS lcs = new LCS();
        Scanner scan = new Scanner(System.in);

        String s1;
        String s2;
        System.out.println("Enter the first String");
        s1=scan.next();
        System.out.println("Enter the Second String");
        s2=scan.next();

        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        int c = a.length;
        int d = b.length;

        System.out.println("Length" + " " +
                lcs.lcs( a, b, c, d ) );
    }

}