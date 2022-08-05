import java.util.Scanner;

class DRUG
{
    public static void main(String[]arg)
    {
        int x,percentage=100,months=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        x=sc.nextInt();
        while(percentage>50)
        {
            percentage-=x;
            months+=1;        
        }
        System.out.println("the drug will expire in" + months + "month(s)");
    }
}