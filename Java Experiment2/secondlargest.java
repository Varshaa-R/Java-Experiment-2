import java.util.*;
class secondlargest
{
    public static void main(String args[])
    {
        
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=obj.nextInt();
        System.out.println("Enter array");
        int i=0,j=0,temp;
        int a[]=new int[50];
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        for(i=0;i<n-1;i++) 
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("The second largest element is"+a[n-2]);

    }
}
