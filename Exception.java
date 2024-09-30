import java.util.*;
class Exception
{
public static void main(String [] args)
{
int divisor=2,result;
int dividend[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter element=");
for(int i=0;i<5;i++)
{
dividend[i]=sc.nextInt();
}

try
{
int div=dividend[6];
System.out.println("dividend is="+div);
result=dividend[4]/divisor;
System.out.println(result);
}

catch(ArithmeticException ae)
{
System.out.println("error msg="+ae.getMessage());
}

catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println("error msg="+ae.getMessage());
}

}
}