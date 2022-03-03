import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float c,temp=0;
        int n=s.nextInt();
       for(float i=1;i<=n;i++)
       {
            c=(1/i);
            temp=temp+c;

        }
        System.out.printf("%.2f",temp);
    }
}