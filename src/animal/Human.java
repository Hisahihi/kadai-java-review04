package animal;

public class Human extends Animal implements Thinkable {

	// Animalクラスからの継承
	public Human(String humanName, int age, String humanHobby) {
		super(humanName, age);
		this.humanHobby = humanHobby;
	}

	// フィールド
	private String humanHobby; // 趣味

	public String getHumanHobby() {
		return humanHobby;
	}

	public void setHumanHobby(String humanHobby) {
		this.humanHobby = humanHobby;
	}

	@Override
	public void think() {
		System.out.println("私は" + humanHobby + "について考えています。");
	}

}
