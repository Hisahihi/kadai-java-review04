package animal;

public class Human extends Animal {

	public Human(String HumanName, int age, String HumanHobby) {
		super(HumanName, age, HumanHobby);

	}


	public interface Thinkable {
	    void think();
	}
}
