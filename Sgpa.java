import java.util.Scanner;
class Subject
{
 int marks;
 int credits;
 int grade;
}
  class Student
 {
  String name;
  String usn;
  double SGPA;
  Subject[] subject;
  Scanner s;
  Student()
  {
   int i;
   subject=new Subject[8];
   for(i=0;i<8;i++)
   subject[i]=new Subject();
   s=new Scanner(System.in);
  }
  void getStudentDetails()
  {
   System.out.println("Enter the name of the student");
   name=s.nextLine();
   System.out.println("Enter the USN");
   usn=s.nextLine();
  }
  void getMarks()
  {
   System.out.println("Enter the marks and credits of each subject");
   for(int i=0;i<8;i++)
    {
     subject[i].marks=s.nextInt();
     subject[i].credits=s.nextInt();
     if(subject[i].marks>=90)
      subject[i].grade=10;
     else if(subject[i].marks>=80&&subject[i].marks<90)
      subject[i].grade=9;
     else if(subject[i].marks>=70&&subject[i].marks<80)
      subject[i].grade=8;
     else if(subject[i].marks>=60&&subject[i].marks<70)
      subject[i].grade=7;
     else if(subject[i].marks>=50&&subject[i].marks<60)
      subject[i].grade=6;
     else if(subject[i].marks>=40&&subject[i].marks<50)
      subject[i].grade=5;
     else
     {
      System.out.println("Inavlid marks");
      break;
     }
    }
  }
   void computeSGPA()
    {
     double creditsgained=0;
     double totalcredits=0;
     for(int i=0;i<8;i++)
    {
     totalcredits+=subject[i].credits;
     creditsgained+=subject[i].grade*subject[i].credits;
    }
    SGPA=creditsgained/totalcredits;
    }
   void display()
    {
     System.out.println("Name of the student = "+name );
     System.out.println("USN = "+usn);
     System.out.println("SGPA = "+SGPA);
    }
}
 public class Sgpa{
    public static void main(String args[])
   {
    Student s1=new Student();
    s1.getStudentDetails();
    s1.getMarks();
    s1.computeSGPA();
    s1.display();
   }
}
