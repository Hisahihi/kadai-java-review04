package animal;

public class Animal implements Thinkable {
	// フィールド
	private String HumanName;  // 氏名
	private int age;           // 年齢
	private String HumanHobby; // 趣味

	public void think() {
		System.out.println("私は"+HumanHobby+"について考えています。");
	}

	// 引数ありコンストラクタ
	public Animal(String HumanName, int age, String HumanHobby) {
		this.HumanName = HumanName;
		this.age = age;
		this.HumanHobby = HumanHobby;
	}

	public String getHumanName() {
		return HumanName;
	}

	public void setHumanName(String HumanName) {
		this.HumanName = HumanName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHumanHobby() {
		return HumanHobby;
	}

	public void setHumanHobby(String HumanHobby) {
		this.HumanHobby = HumanHobby;
	}


	//sayのメソッド
	public void say() {
		System.out.println(HumanName +"です。"+ age +"歳です。");
	}


}
