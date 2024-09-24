class Mythread extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("Thread A="+i);
try
{
Thread.sleep(1000);
}

catch (InterruptedException e)
{
System.out.println(e);
}
}
}
}

class Anotherthread extends Thread
{
public void run()
{
for(int i=1;i<=6;i++)
{
System.out.println("Thread B="+i);
try
{
Thread.sleep(1000);
}

catch (InterruptedException e)
{
System.out.println(e);
}
}
}
}

public class Thread1
{
public static void main(String[] args)
{
Mythread threadA=new Mythread();
Anotherthread threadB=new Anotherthread();
threadA.start();
threadB.start();
}
}




