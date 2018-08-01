/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0)
    {
        int i;
        String s1=sc.next();
        String s2=sc.next();
        char arr1[]=new char[s1.length()];
        char arr2[]=new char[s2.length()];
        arr1=s1.toCharArray();
        arr2=s2.toCharArray();
        int a1[]= new int[256];
        for(i=0; i<s1.length(); i++)
        {
            a1[arr1[i]]++;
        }
        for(i=0; i<s2.length(); i++)
        {
            a1[arr2[i]]--;
        }
        for(i=0; i<=255; i++)
        {
            if(a1[i]!=0)
            {
            System.out.println("NO");
			break;
            }
        }
        if(i==256)
        System.out.println("YES");
        t--;
    }
	}
}