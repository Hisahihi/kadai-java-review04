package animal;

public class Animal {

	// フィールド
	private String humanName; // 氏名
	private int age; // 年齢

	// 引数ありコンストラクタ
	public Animal(String humanName, int age) {
		this.humanName = humanName;
		this.age = age;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String HumanName) {
		this.humanName = HumanName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// sayのメソッド
	public void say() {
		System.out.println(humanName + "です。" + age + "歳です。");
	}

}
