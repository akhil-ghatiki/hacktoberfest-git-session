import java.util.*;
class Student{
 int id ;
 String name;
 double avg;
 Student(int id){
   this.id = id;
 }
 Student(int id , String name )
 {
   this(id);
   this.name= name;
 }
 Student (int id , String name , double avg){
   this(id,name);
   this.avg = avg;
 }
 void display( ){
   System.out.println(id + " , " + name + ", " + avg);
 }
}
public class Array {
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the number of Students");
   int n = sc.nextInt();
   Student s[] = new Student[n];
   for(int i=0; i<s.length ; i++)
   {
     System.out.println("Enter the Student Details of-> " +(i+1));
     int x = sc.nextInt();
     String str = sc.next();
     double y = sc.nextDouble();
     s[i] = new Student(x,str,y);
   }
   System.out.println("Enter the Average to display list ");
   double p = sc.nextDouble();
   for(int i=0; i< n ; i++)
     if(s[i].avg >= p)
       s[i].display();
  }
}