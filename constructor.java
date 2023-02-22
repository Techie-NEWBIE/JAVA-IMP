class student
{
   int rollno;
   String name;
         student(int r,String n)
         {
           rollno=r;
           name=n;
         }
         void displayinfo()
         {
            System.out.println("  Name of student :"+name);
            System.out.println("Rollno of student :"+rollno);
         }
}
class constructor
{
    public static void main(String[]args)
    {
        student s1=new student(11,"EBIN");
        student s2=new student(1,"EVO");
        System.out.println("student 1 info :");
        s1.displayinfo();
        System.out.println("student 2 info :");
        s2.displayinfo();
    }
}

