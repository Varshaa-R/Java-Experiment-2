import java.util.*;
class smallestarray
{
    public static void main(String args[])
    {
        int x,n,i;
        System.out.println("Enter the size");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        int a[]=new int[50];
        System.out.println("Enter the element");
        for(i=0;i<n;i++)
        a[i]=obj.nextInt();
        x=a[0];
        for(i=0;i<n;i++)
        {
            if(x>a[i])
            {
                x=a[i];
            }
        }
        System.out.println("Smallest no="+x);

    }
}