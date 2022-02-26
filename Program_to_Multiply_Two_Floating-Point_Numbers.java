import java.util.Scanner;
class Mul
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        float mul=0;
        float l=s.nextFloat();
        float m=s.nextFloat();
        mul=l*m;
        System.out.printf("%.2f",mul);
    }
}