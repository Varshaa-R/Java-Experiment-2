import java.util.*;
class sumarray
{
    public static void main(String args[])
    {
        System.out.println("Enter array limit");
        Scanner obj=new Scanner(System.in);
        int n = obj.nextInt();
        int a[]=new int[100];
        int sum=0;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Sum of elements="+sum);

    }
}