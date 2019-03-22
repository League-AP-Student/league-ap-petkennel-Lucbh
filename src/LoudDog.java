

public class LoudDog extends Dog
{



public LoudDog (String petName) {
	
super(petName);	




}

public String speak() {
	
String dogSound = super.speak();

return dogSound + dogSound;


}

}
