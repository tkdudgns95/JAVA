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
		
		return "Ű�� " + tall + "�̰� �����԰� " + weight +"ų���� ������ �ֽ��ϴ�. �̸��� " + name +"�̰� ���̴� " + age + "�Դϴ�."; 
	}
}






