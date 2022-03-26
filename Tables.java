import java.util.*;
class Tables
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        int sum=0;
        for(int i=1;i<=r;i++)
        {
            sum=n*i;
            //i++;
            System.out.println(n+" x "+i+" = "+sum);
            i++;
        }
    }
}