import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        int n=r.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=r.nextInt();
        }
        int index=r.nextInt();
        System.out.println("Array after deletion is");
        for(i=0;i<n;i++)
        {
            if(i==index)
            {
                continue;
            }
            else
            {
                System.out.println(a[i]);
            }
        }
    }
}
