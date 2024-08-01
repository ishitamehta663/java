import java.util.Scanner;
class Matrix
{
int a[][]=new int [2][2];
int b[][]=new int [2][2];
int c[][]=new int [2][2];
Scanner sc= new Scanner(System.in);

void getele1()
{
System.out.println("enter array elements1:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=sc.nextInt();
}
}
}

void getele2()
{
System.out.println("enter array elements2:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
b[i][j]=sc.nextInt();
}
}
}

void show()
{
System.out.println("array:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

System.out.println("array2:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}

void add()
{
System.out.println("Matrix addition");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}

void sub()
{
System.out.println("Matrix substraction");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
c[i][j]=a[i][j]+b[i][j];
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}

void mul()
{
System.out.println("Matrix multiplication");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
c[i][j]=0;
for(int k=0;k<2;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}

}

class Matrix_op
{
public static void main(String [] args)
{
Matrix m=new Matrix();
m.getele1();
m.getele2();
m.show();
m.add();
m.sub();
m.mul();
}
}




