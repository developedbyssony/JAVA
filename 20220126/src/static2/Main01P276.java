package static2;

public class Main01P276 {

	public static void main(String[] args) {
	    // Asean ���� ���� ���� ��ǥ ������ �ֿܼ� ������.
		// System.out.println(Asean.presentationScore);
		/// Asean.presentationScore(); �̷��� ���� �� �޼ҵ�
		System.out.println(Asean.getPresentationScore());

		
		// Asean ���� 4���� ���������� ���� ����, �� �ο��� ������ ��ȸ���ּ���.
		Asean a1 = new Asean(10,20,30);
		Asean a2 = new Asean(9,20,30);
		Asean a3 = new Asean(8,20,30);
		Asean a4 = new Asean(7,20,30);
		
		
		// Asean a1 = new Asean(10,20,30);
		System.out.println("[a1�� ����]");
		a1.showAseanInfo();
		System.out.println("----------------------");
		System.out.println("[a2�� ����]");
		a2.showAseanInfo();		
		System.out.println("----------------------");
		System.out.println("[a3�� ����]");
		a3.showAseanInfo();		
		System.out.println("----------------------");
		System.out.println("[a4�� ����]");
		a4.showAseanInfo();		
	}

}