import java.util.*;
class employee
{
String fname,lname;
double salary,raise;

employee(String f,String l,double s)
{
this.fname=null;
this.lname=null;
this.salary=0;
}

void setfirst_name(String f)
{
fname=f;
}

void setlast_name(String l)
{
lname=l;
}

void setm_salary(double s)
{
salary=s;
}

String getfirst_name()
{
return fname;
}

String getlast_name()
{
return lname;
}

double getm_salary()
{
return salary;
}

void setraise(double r)
{
raise=r;
}

double getraise()
{
return salary*0.10;
}

}

class employeeList
{
public static void main(String[] args)
{
String f,l;
double s;

Scanner sc=new Scanner(System.in);
System.out.print("Enter the first name:");
f=sc.next();

System.out.print("Enter the last name:");
l=sc.next();

System.out.print("Enter the salary:");
s=sc.nextDouble();

employee e= new employee(f,l,s);
e.setfirst_name(f);
e.setlast_name(l);
e.setm_salary(s);
System.out.println("first name :"+e.getfirst_name());
System.out.println("last name :"+e.getlast_name());
System.out.println("salary is :"+e.getm_salary());

double raisedsalary=e.getm_salary()+e.getraise();
System.out.println("raised salary :"+raisedsalary);

}
}







