package No17;

public class Fruit {
	public String color;
	public int number;
	public String size;
	
	public void FruitInfo() {
		System.out.println("이 과일은" + color + "색 이며, 과일 번호는" + number + "입니다." + "크기는" + size + "g입니다." );
		
	}
	
	public String getsize() {
		return size;
	}
	
}
