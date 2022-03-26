import java.util.*;
class Divisible
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int K=s.nextInt();
        int []arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<N;i++)
        {
           // if(arr[i]==1)
            if(arr[i]%K==0)
            {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}