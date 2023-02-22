import java.util.*;
class Shape
{
float findArea(float l,float b)
{
return l*b;
}
float findArea(float r)
{
return (float)3.14*r*r;
}
float findArea(float tb,float h)
{
return (float)tb*(h/2);
}
}
class overloading
{
public static void main(String[]args)
{

Shape myobj=new Shape();
Scanner n=new Scanner(System.in);

System.out.println("To find area of rectangle");
System.out.println("Enter the length :");
float l=n.nextFloat();
System.out.println("Enter the breadth :");
float b=n.nextFloat();
System.out.println("Area of rectangle ="+myobj.findArea(l,b));

System.out.println("To find area of circle");
System.out.println("Enter the radious :");
float r=n.nextFloat();
System.out.println("Area of cirlce ="+myobj.findArea(r));

System.out.println("To find area of triangle");
System.out.println("Enter the base :");
float tb=n.nextFloat();
System.out.println("Enter the height :");
float h=n.nextFloat();
System.out.println("Area of triangle ="+myobj.findArea(tb,h));
}
}
