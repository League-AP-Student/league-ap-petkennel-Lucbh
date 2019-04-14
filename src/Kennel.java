import java.util.ArrayList;
import java.util.List;

public class Kennel {
	
	private List<Pet> petList = new ArrayList<Pet>();
	
	
	public Kennel() {
		
		petList.add(new Dog("Bill"));
		petList.add(new Cat("Joe"));
		petList.add(new LoudDog("Dan"));
		
	}
	

	public static void main(String[] args) {
		Kennel k = new Kennel();
		k.allSpeak();
			

	}
	
	/** For every Pet in the kennel, print the name followed by
	 * the result of a call to its speak method, one line per Pet
	 */
	public void allSpeak(){
		/* code goes here */
		
		for (Pet a : petList)
		{
			System.out.println(a.getName() + " " + a.speak());
		}
		


		/*	for (int i = 0; i < petList.size() -1; i++) {

			System.out.println(petList[i].getName() + petList[i].speak);
		

			}
*/
			

	}
	
	
}
