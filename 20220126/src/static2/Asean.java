package static2;

public class Asean {
	// �⼮����(check), �߰�����(midTerm), �⸻����(finalTerm)
	// ������ �������ּ���.
	// �� �������� ���� ��ü�� ���ε��� �����մϴ�.
	public int check;
	public int midTerm;
	public int finalTerm;

	// ���� ��ǥ������ presentaionScore�� static���� ������ּ���.
	// �� ������ 19���Դϴ�.
	private static int presentationScore = 19;
	
	// �����ڴ� ��ü ������ �⼮, �߰�����, �⸻���� ������
	// �޾Ƽ� ��ġ�� �Է����ݴϴ�.
	                 // 9        20            30
	public Asean(int check, int midTerm, int finalTerm) {
		this.check = check;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
	}
	
	// �Ϲ� �޼���� showAseanInfo()�� �������ֽõ�
	// ���� ��ü�� �ֿܼ� ��ȸ�ϰ� ���ּ���.
	public void showAseanInfo() {
		System.out.println("�߰����� :" + this.midTerm);
		System.out.println("�⸻���� :" + this.finalTerm);
		System.out.println("�⼮���� :" + this.check);
		System.out.println("���� ��ǥ ���� :" + this.presentationScore);
	}
	
	// presentationScore�� private�� ��ȯ�� ���
	// main �������� ���̷�Ʈ�� ��ȸ�� �Ұ����մϴ�.
	// Asean�� new Ű����� ������ �ʰ���
	// private presentationScore�� �ֿܼ� ��ȸ�����ϵ���
	// ��ġ�� ���غ�����. /// -> 9������ �ڵ�
	public static int getPresentationScore() {
		return presentationScore;
	}

	public static void setPresentationScore(int presentationScore) {
		Asean.presentationScore = presentationScore;
	}
	
	
}