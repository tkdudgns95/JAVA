package No18;

public class Man {
	public String tall;
	public int weight;
	public String name;
	public int age;
	
	public Man() {
		
	}
	
	public Man(String tall, int weight, String name, int age) {
		
		this.tall = tall;
		this.weight = weight;
		this.name = name;
		this.age = age;
		
	}
	
	public String showManInfo() {
		
		return "키가 " + tall + "이고 몸무게가 " + weight +"킬로인 남성이 있습니다. 이름은 " + name +"이고 나이는 " + age + "입니다."; 
	}
}






