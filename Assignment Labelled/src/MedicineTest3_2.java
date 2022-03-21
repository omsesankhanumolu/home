public class MedicineTest3_2 
{
public static void main(String[] args) 
{
Medicine3_2 m[] = new Medicine3_2[5];
double i = Math.random()*4;
int j = (int) i;
System.out.println(j);
switch(j)
{
case 1: m[0] = new Medicine3_2();

m[1] = new Tablet();
m[0].displayLabel();
m[1].displayLabel();
break;
case 2: m[2] = new Medicine3_2();
m[3] = new Syrup();
m[2].displayLabel();
m[3].displayLabel();
break;
case 3: m[4] = new Medicine3_2();
m[5] = new Ointment();
m[4].displayLabel();
m[5].displayLabel();
break;
default: System.out.println("Invalid Choice");
}
}
}

