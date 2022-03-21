import java.io.*;
public class StudemntDemo7_2
{
     public static void main(String args[])throws Exception
     {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

          System.out.print("Enter roll number: ");
          int roll = Integer.parseInt(br.readLine());
          System.out.print("\nEnter name: ");
          String name = br.readLine();
          System.out.print("\nEnter age: ");
          int age = Integer.parseInt(br.readLine());
          System.out.print("\nEnter course: ");
          String course = br.readLine();
          Student7_2 s = new Student7_2(roll,name,age,course);
          s.display();
     }
}