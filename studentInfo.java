import java.util.Scanner;
class student
{
int rollno;
String name;
String cours;
float marks;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name");
name=sc.nextLine();
System.out.println("enter the rollno");
rollno=sc.nextInt();
System.out.println("enter the cours");
cours=sc.next();
System.out.println("enter the marks");
marks=sc.nextFloat();
}
void putdata()
{
System.out.println("rollno:"+rollno);
System.out.println("name:"+name);
System.out.println("cours:"+cours);
System.out.println("marks:"+marks);
}
}
class studentInfo
{
public static void main(String args [])
{
student ss=new student();
ss.getdata();
ss.putdata();
}
}