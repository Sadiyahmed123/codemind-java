import java.util.Scanner;
class Average
{
    public static void main(String args[])
    {
        int N;
        float M;
        double Average;
        Scanner s=new Scanner(System.in);
        N=s.nextInt();
        M=s.nextFloat();
        Average=(N+M)/2;
        System.out.printf("%.4f",Average);
    }
}