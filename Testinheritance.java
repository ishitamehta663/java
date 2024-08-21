import java.util.*;

class Person
{
String name,address;
int height,weight;

void input()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the name=");
name=sc.next();
System.out.print("Enter the address=");
address=sc.next();
System.out.print("Enter the height=");
height=sc.nextInt();
System.out.print("Enter the weight=");
weight=sc.nextInt();
}

void output()
{
System.out.println("name is:"+ name);
System.out.println("address is:"+ address);
System.out.println("height is:"+ height);
System.out.println("weight is:"+ weight);
}

}

class Student extends Person
{
int roll_no;

void calculateAvg()
{
Scanner sc= new Scanner(System.in);
System.out.print("enter no.of subjects=");
int n=sc.nextInt();

int marks[]=new int[n];
int i;
int sum=0;

System.out.print("Enter the marks=");
for(i=0;i<n;i++)
{
marks[i]=sc.nextInt();
}

for(i=0;i<n;i++)
{
sum =sum + marks[i];
}
int avg=sum/n;
System.out.println("Avg is=" + avg);
}



void input1()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the roll_no=");
roll_no=sc.nextInt();
}

void output1()
{
System.out.println("roll_no is" + roll_no);
}
}

class Employee extends Person
{
int empId;

void calculateTax()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter annual salary");
double s=sc.nextDouble();
System.out.println("Enter deductible salary");
double d=sc.nextDouble();

double total=s-d;
int r=0;
if(total<=200000)
r=0;
else if(total <=500000)
r=10;
else if(total<=1000000)
r=20;
else
r=30;

double tax=total*r/100;
System.out.println("taxable income" + total);
System.out.println("Income tax" + tax);
double salary= s - tax;
System.out.println("salary is=" + salary);
}

void input2()
{
Scanner sc=new Scanner(System.in);

System.out.print("Enter the emp_id=");
empId=sc.nextInt();
}

void output2()
{
System.out.println("emp_id is=" +empId);
}
}

class Testinheritance
{
public static void main(String [] args)
{
Person p=new Person();
p.input();
p.output();

Student s=new Student();
s.calculateAvg();
s.input1();
s.output1();

Employee e=new Employee();
e.calculateTax();
e.input2();
e.output2();
}
}




