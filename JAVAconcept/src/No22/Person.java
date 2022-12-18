package No22;

public class Person {
	/* ��ü �ڽ��� ����Ű�� this
	 * 
	 * this�� �ϴ� ��
	 * �ν��Ͻ� �ڽ��� �޸𸮸� ����Ŵ
	 * �����ڿ��� �� �ٸ� �����ڸ� ȣ�� �� �� ���
	 * �ڽ��� �ּ�(������)�� ��ȯ��.
	 * 
	 * Ŭ���� ������ ���������� ������ �ּ� ���� ������ �ּ� ����
	 * ������ Ű�����̴�.
	 * 
	 * �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� this
	 * Ŭ������ �����ڰ� ���� ���� ���, this�� �̿��Ͽ� �����ڿ��� �ٸ�
	 * �����ڸ� ȣ���� �� �ִ�.
	 * �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� ���, �ν��Ͻ��� ������ �������� ����
	 * �����̹Ƿ� this() statement������ �ٸ� statement�� �� �� ����.
	 * 
	 * �ڽ��� �ּҸ� ��ȯ�� �� �ִ�.(this)
	 * 
	 * 
	 */
	
	String name;
	int age;
	
	public Person()
	{	
		this("no name", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson()
	{
		System.out.println(name + "," + age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.showPerson();
		
		System.out.println(person);
		
		Person person2 = person.getPerson();
		System.out.println(person2);
	}
}
