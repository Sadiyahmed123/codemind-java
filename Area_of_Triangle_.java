import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        double Area=0.0;
        float A=s.nextFloat();
        float B=s.nextFloat();
        float C=s.nextFloat();
        float res=((A+B+C)/2);
        Area=Math.sqrt(res*(res-A)*(res-B)*(res-C));
       
        System.out.printf("%.2f",Area);
    }
}