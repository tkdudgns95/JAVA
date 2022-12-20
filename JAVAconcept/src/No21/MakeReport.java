package No21;

public class MakeReport {
	/* ĸ��ȭ(encapsultation)
	 * ���� ������ Ȱ���� ĸ��ȭ
	 * �� �ʿ��� ������ ��ɸ� �ܺο� ������
	 * ��κ��� ��� ������ �޼��带 ���߰� �ܺο� ���յ� �������̽����� �����Ͽ� �ϰ��� ����� �����ϰ� ��
	 * ������ �޼��峪 ��� ������ ���������ν� �߻��ϴ� ������ �ּ�ȭ�Ѵ�.
	 * 
	 * 
	 */
	StringBuffer buffer = new StringBuffer();
	
	private String line = "=====================================\n";
	private String title = " �̸�\t   �ּ� \t\t  ��ȭ��ȣ \n";
	
	private void makeHeader()
	{
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody()
	{
		buffer.append("james \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0987\n");
	}
	
	private void makeFooter()
	{
		buffer.append(line);
	}
	
	public String getReport() // �ܺο��� �� �� �ִ� �޼���(public)
	{
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
}