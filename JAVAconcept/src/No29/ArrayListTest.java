package No29;

import java.util.ArrayList;
import ch21.Book;

public class ArrayListTest {
	/*	��ü �迭�� ������ Ŭ���� ArrayList
	 * 	������ �迭 ����� ��� ����� �迭�� ���̸� ���ϰ� ����� ������ �迭�� ���̺��� Ŀ����,
	 * �迭�� ���Ҵ��ϰ� �����ؾ��ߴ�.
	 * 
	 * �迭�� ��Ҹ� �߰��ϰų� �����ϸ� �ٸ� ��ҵ��� �̵��� ���� ������ �ؾ� ��
	 * ArrayList�� ��ü �迭�� �� �� ȿ�������� �����ϱ� ���� �ڹٿ��� �������ִ� Ŭ�����̴�.
	 * �̹� ���� �޼������ ������ �˰������� �����Ǿ� �־� �� �޼����� ��� ����� ������ �����ϰ� ��� �����ϴ�.
	 */

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�¹���1 ", "������"));
		library.add(new Book("�¹���2 ", "������"));
		library.add(new Book("�¹���3 ", "������"));
		library.add(new Book("�¹���4 ", "������"));
		library.add(new Book("�¹���5 ", "������"));
		
		for(int i = 0; i < library.size(); i++ ) {
			library.get(i).showInfo();
		}
	}

}
