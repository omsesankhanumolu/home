import java.util.Scanner;

class Project1_2 {
    int length; 
    int breadth; 
    int area; 
   
    public Project1_2()
    {
    	length = 0;
    	breadth= 0;
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = in.nextInt();
    }

    void calculate() {
        area = length * breadth;
        
    }

    void display() {
        System.out.println("Area of Rectangle = " + area);
       
    }

    public static void main(String args[]) {
    	Project1_2 obj1 = new Project1_2();
        obj1.input();
        obj1.calculate();
        obj1.display();
        System.out.println("****************************");
        Project1_2 obj2 = new Project1_2();
        obj2.input();
        obj2.calculate();
        obj2.display();
        System.out.println("****************************");
        Project1_2 obj3 = new Project1_2();
        obj3.input();
        obj3.calculate();
        obj3.display();
        System.out.println("****************************");
        Project1_2 obj4 = new Project1_2();
        obj4.input();
        obj4.calculate();
        obj4.display();
        System.out.println("****************************");
        Project1_2 obj5 = new Project1_2();
        obj5.input();
        obj5.calculate();
        obj5.display();
    }
}