package inheritance;

// ��� ����
// Ŭ���� ��Ī �����ʿ� <extends �θ�Ŭ���� �̸�>�� �����ϴ�.
// �̷��� ����� Ŭ������ �θ�, �ڽ�Ŭ������ �ϳ��� ��ü ���ο�
// �����ϴ� ���·� �޸𸮿� �����˴ϴ�.
public class Student extends Person { // ��Ʃ��Ʈ�� �޽� ���� �ڿ��� ��ӹްڴٴ� �̾߱�
    // name, age�� extends person�� ���� ���� ����� �Ǹ�, �ٽ� �� �� ������ �ʿ䰡 ����
	// ����Ӽ�(�̸�, ����)�� �ƴ� �л����� ������ Ư�� ����
	public int stuNum; // �й�
	
	// getStuInfo() �޼��带 �������ּ���.
	// �̸�, ����, �й��� ��� �ֿܼ� ����ݴϴ�.
	public void getStuInfo() {
		System.out.println("�̸� :" + name + "���� :" + age + "�й� :" + stuNum);
	}
}