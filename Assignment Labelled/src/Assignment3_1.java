import java.util.Random;


public class Assignment3_1 {

	public static void main(String[] args) {
		Instrument3_1[] instruments = new Instrument3_1[10];
		
		Random rand = new Random();
	    
	    for (int i = 0; i < 10; i++) {
	    	int randomNum = rand.nextInt((3 - 1) + 1) + 1;
	    	
	    	if (randomNum == 1)
	    		instruments[i] = new Piano3_1();
	    	else if (randomNum == 2)
	    		instruments[i] = new Flute3_1();
	    	else if (randomNum == 3)
	    		instruments[i] = new Guitar3_1();
	    	
	    	instruments[i].play();
	    }
	    
	    for (int i = 0; i < 10; i++) {
	    	if (instruments[i] instanceof Piano3_1) 
	    		System.out.println("Piano is stored at index " + i);
	    	else if (instruments[i] instanceof Flute3_1) 
	    		System.out.println("Flute is stored at index " + i);
	    	else if (instruments[i] instanceof Guitar3_1) 
	    		System.out.println("Guitar is stored at index " + i);
	    }

	}

}