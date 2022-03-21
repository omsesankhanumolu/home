import java.util.Vector;
public class TestEmployeeCollection6_3 {
	public static void main(String[] args) {
		Vector<Employee6_3> v = addInput();
		display(v);
		}

	private static Vector<Employee6_3> addInput() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void display(Vector<Employee6_3> v) {
		// TODO Auto-generated method stub
		
	}

	public static void main1(String[] args) {
		Employee6_3 e1=new Employee6_3 (101,"bhavani", "Mallethula");
		Employee6_3 e2=new Employee6_3 (102,"srlekha", "kakani");
		Employee6_3 e3=new Employee6_3 (103,"akanksha", "pasikanti");
		Vector<Employee6_3> v=new Vector<Employee6_3>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;
	}
	public static void main11(String[] args) {
		for(Employee6_3 e:v)
		{
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
		}
	}
}