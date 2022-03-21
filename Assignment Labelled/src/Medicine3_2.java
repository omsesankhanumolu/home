public class Medicine3_2
{
	public void displayLabel()
{
		System.out.println("Company : Reddy's Labs");
		System.out.println("Address : Hyderabad");
		}
	}
class Tablet extends Medicine3_2{
	 
public void displayLabel()
{
	System.out.println("store in a cool dry place");
	}
}
class Syrup extends Medicine3_2
{
	public void displayLabel()
	{
		System.out.println("Consumption as directed by thephysician");
		}
	}
class Ointment extends Medicine3_2
{
	public void displayLabel()
{
		System.out.println("for external use only");
		}
	}