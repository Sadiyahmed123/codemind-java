import java.util.Scanner;
class Numberof
{
    public static void main(String args[])
    {
        int N,sum=0;
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        sum=(N*(N-1)/2);
        System.out.println(sum);
    }
}