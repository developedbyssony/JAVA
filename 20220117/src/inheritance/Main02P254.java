package inheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// ���⿡ �л� �ϳ��� �������� �ϳ��� ���Ƿ� ��������.
		// �������ǿ��� ���� �̸��� ��� ������ �����ּ���.
		// �л��� �׳� �˾Ƽ� �ۼ����ּ���.
		// ������ ��ü�� ������ get~~~~Info()�� �̿��� �ֿܼ��� ���� ����ּ���.
		
		Student c1 = new Student();
		c1.name = "���ʵ�";
		c1.age = 13;
		c1.stuNum = 13;
		c1.getInfo();
		
		Salaryman c2 = new Salaryman();
		c2.name = "������";
		c2.age = 31;
		c2.salary = 4000;
		c2.getSalaryInfo();

	}

}