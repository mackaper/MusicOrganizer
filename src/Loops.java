public class Loops
{
    public void multiplesOfFive()
    {
        int i=10;
        while(i<96)
        {
            System.out.println(i);
            i = i+5;
        }
    }
    public void printSum()
    {
        int k=1;
        int sum=0;
        while(k<11)
        {
            sum += k;
            k++;
        }
        System.out.println(sum);
    }
    public boolean isPrime (int n)
    {
        boolean check=false;
        int i = 2;
        if(n==2)
        {
            check=true;
        }
        else
        {
            while(i<n)
            {
                if(n%i==0)
                {
                    check = false;
                    break;
                }
                else
                {
                    check=true;
                }
                i = i+1;
            }
        }
         return check;
    }

}