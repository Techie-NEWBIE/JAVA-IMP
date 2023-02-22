import java.util.*;
class Employee
{
 String name;
 int age;
 int phoneNumber;
 String address;
 double salary;
 Employee(String n,int a,int phno,String add,double sal)
 {
  name=n;
  age=a;
  phoneNumber=phno;
  address=add;
  salary=sal;
 }
 public void display()
 {
  System.out.println("Name :"+name);
  System.out.println("Age :"+age);
  System.out.println("phonenumber :"+phoneNumber);
  System.out.println("Address :"+address);
 }
 public void printsalary()
 {
 System.out.println("salary :" +salary);
 }
 }
  class Officer extends Employee
 {
  String specialization;
  Officer(String n,int a,int phno,String add,double sal,String spec)
  {
   super(n,a,phno,add,sal);
   specialization=spec;
  }
  void officerdetails()
  {
   display();
   printsalary();
   System.out.println("specialization :"+specialization);
  }
 }
 class Manager extends Employee
 {
  String department;
  Manager(String n,int a ,int phno,String add,double sal,String dep)
  {
  super(n,a,phno,add,sal);
  department=dep;
  }
  void managerdetails()
  {
  display();
  System.out.println("department :" +department);
  }
 }
 class Test
 {
 public static void main(String args[])
 {
  Officer o=new Officer("EBIN",30,92939,"XCVFG",250000.0,"ACCOUNTANT");
  Manager m=new Manager("ABHIJITH",40,92936,"SDSFDS",5000.0,"SALES");
  System.out.println("Info about Manager :");
  m.managerdetails();
  System.out.println("Info about Officer :");
  o.officerdetails();
  }
  }